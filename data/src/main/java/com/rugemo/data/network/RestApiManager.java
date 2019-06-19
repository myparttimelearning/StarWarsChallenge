package com.rugemo.data.network;

import com.rugemo.data.network.model.StarWarsCharacter;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class RestApiManager implements RestApi {

    NetworkService networkService;

    @Inject
    RestApiManager(NetworkService networkService) {
        this.networkService = networkService;
    }

    @Override
    public Single<List<StarWarsCharacter>> getCharacterList() {
        return networkService.getCharacterList();
    }
}
