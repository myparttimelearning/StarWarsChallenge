package com.rugemo.data.db.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface FavouriteCharacterDAO {
    @Query("SELECT * FROM favourites")
    List<FavouriteCharacter> getAll();

    @Insert(onConflict = REPLACE)
    void insertFavouriteCharacter(FavouriteCharacter favouriteCharacter);

    @Insert
    void insertFavouriteCharacters(FavouriteCharacter... favouriteCharacters);

    @Delete
    void deleteFavouriteCharacter(FavouriteCharacter favouriteCharacter);

    @Update
    void updateFavouriteCharacter(FavouriteCharacter favouriteCharacter);

    @Query("SELECT * FROM favourites WHERE uid IN (:names)")
    List<FavouriteCharacter> loadAllByName(String[] names);

    @Query("SELECT * FROM favourites WHERE name LIKE :name LIMIT 1")
    FavouriteCharacter findByName(String name);
}
