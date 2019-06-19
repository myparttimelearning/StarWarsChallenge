package com.rugemo.data.network;

import com.rugemo.data.ApiSettings;
import com.rugemo.data.AppModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Module(includes = AppModule.class)
public class NetworkModule {

    @Provides
    @Singleton
    public OkHttpClient providesClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);

        return new OkHttpClient.Builder().addInterceptor(interceptor).addInterceptor(chain -> {
            Request request = chain.request();
            return chain.proceed(request);
        }).build();
    }

    @Provides
    @Singleton
    Retrofit providesRetrofit(ApiSettings apiSettings, OkHttpClient httpClient) {
        return new Retrofit.Builder()
                .baseUrl("https://" + apiSettings.host() + "/")
                .client(httpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
}
