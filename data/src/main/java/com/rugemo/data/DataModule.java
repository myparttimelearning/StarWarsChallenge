package com.rugemo.data;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {
    private final Application application;
    private final ApiSettings apiSettings;
    private final DataManager dataManager;

    public DataModule(Application application,
                      ApiSettings apiSettings,
                      DataManager dataManager) {

        this.application = application;
        this.apiSettings = apiSettings;
        this.dataManager = dataManager;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return application;
    }

    @Provides
    @Singleton
    ApiSettings providesApiSettings() {
        return apiSettings;
    }

    @Provides
    @Singleton
    DataManager providesDataManager() { return dataManager; }
}
