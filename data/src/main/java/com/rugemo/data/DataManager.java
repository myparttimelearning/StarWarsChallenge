package com.rugemo.data;

import com.rugemo.data.db.FavouriteCharacterDatabase;
import com.rugemo.data.db.model.FavouriteCharacter;
import com.rugemo.data.db.model.FavouriteCharacterDAO;
import com.rugemo.data.network.RestApi;
import com.rugemo.data.network.model.StarWarsCharacter;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class DataManager implements FavouriteCharacterDAO, RestApi {

    private final FavouriteCharacterDatabase favouriteCharacterDatabase;
    private final RestApi restApi;

    @Inject
    DataManager(FavouriteCharacterDatabase favouriteCharacterDatabase,
                RestApi restApi) {
        this.favouriteCharacterDatabase = favouriteCharacterDatabase;
        this.restApi = restApi;
    }

    @Override
    public List<FavouriteCharacter> getAll() {
        return favouriteCharacterDatabase.favouriteCharacterDAO().getAll();
    }

    @Override
    public void insertFavouriteCharacter(FavouriteCharacter favouriteCharacter) {
        favouriteCharacterDatabase.favouriteCharacterDAO().insertFavouriteCharacter(favouriteCharacter);
    }

    @Override
    public void insertFavouriteCharacters(FavouriteCharacter... favouriteCharacters) {
        favouriteCharacterDatabase.favouriteCharacterDAO().insertFavouriteCharacters(favouriteCharacters);
    }

    @Override
    public void deleteFavouriteCharacter(FavouriteCharacter favouriteCharacter) {
        favouriteCharacterDatabase.favouriteCharacterDAO().deleteFavouriteCharacter(favouriteCharacter);
    }

    @Override
    public void updateFavouriteCharacter(FavouriteCharacter favouriteCharacter) {
        favouriteCharacterDatabase.favouriteCharacterDAO().updateFavouriteCharacter(favouriteCharacter);
    }

    @Override
    public List<FavouriteCharacter> loadAllByName(String[] names) {
        return favouriteCharacterDatabase.favouriteCharacterDAO().loadAllByName(names);
    }

    @Override
    public FavouriteCharacter findByName(String name) {
        return favouriteCharacterDatabase.favouriteCharacterDAO().findByName(name);
    }

    @Override
    public Single<List<StarWarsCharacter>> getCharacterList() {
        return restApi.getCharacterList();
    }
}
