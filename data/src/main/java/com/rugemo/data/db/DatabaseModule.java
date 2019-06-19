package com.rugemo.data.db;

import android.app.Application;

import androidx.room.Room;

import com.rugemo.data.AppModule;
import com.rugemo.data.db.favouritecharacters.FavouriteCharacterDAO;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = AppModule.class)
public class DatabaseModule {

    @Provides
    @Singleton
    public FavouriteCharacterDatabase providesFavouriteCharacterDatabase(Application application) {
        return Room.databaseBuilder(application.getApplicationContext(),
                FavouriteCharacterDatabase.class,
                FavouriteCharacterDatabase.DB_NAME)
                .fallbackToDestructiveMigration()
                .build();
    }

    @Singleton
    @Provides
    public FavouriteCharacterDAO providesFavouriteCharacterDAO(FavouriteCharacterDatabase favouriteCharacterDatabase) {
        return favouriteCharacterDatabase.favouriteCharacterDAO();
    }

}
