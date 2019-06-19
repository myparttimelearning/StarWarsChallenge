package com.rugemo.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.rugemo.data.db.model.FavouriteCharacter;
import com.rugemo.data.db.model.FavouriteCharacterDAO;

@Database(entities = {FavouriteCharacter.class}, version = 1, exportSchema = false)
public abstract class FavouriteCharacterDatabase extends RoomDatabase {
    static final String DB_NAME = "character-db";

    public abstract FavouriteCharacterDAO favouriteCharacterDAO();
}
