package com.rugemo.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.rugemo.data.db.favouritecharacters.FavouriteCharacter;
import com.rugemo.data.db.favouritecharacters.FavouriteCharacterDAO;

@Database(entities = {FavouriteCharacter.class}, version = 1, exportSchema = false)
public abstract class FavouriteCharacterDatabase extends RoomDatabase {
    public static final String DB_NAME = "favcharacter.db";

    public abstract FavouriteCharacterDAO favouriteCharacterDAO();
}
