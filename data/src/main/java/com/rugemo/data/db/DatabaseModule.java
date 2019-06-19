package com.rugemo.data.db;

import android.app.Application;

import androidx.room.Room;

import com.rugemo.data.DataModule;
import com.rugemo.data.db.model.FavouriteCharacterDAO;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = DataModule.class)
class DatabaseModule {

    @Provides
    @Singleton
    FavouriteCharacterDatabase providesFavouriteCharacterDatabase(Application application) {
        return Room.databaseBuilder(application.getApplicationContext(),
                FavouriteCharacterDatabase.class,
                FavouriteCharacterDatabase.DB_NAME)
                .fallbackToDestructiveMigration()
                .build();
    }

    @Singleton
    @Provides
    FavouriteCharacterDAO providesFavouriteCharacterDAO(FavouriteCharacterDatabase favouriteCharacterDatabase) {
        return favouriteCharacterDatabase.favouriteCharacterDAO();
    }
}
