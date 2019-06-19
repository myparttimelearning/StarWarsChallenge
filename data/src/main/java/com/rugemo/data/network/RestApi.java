package com.rugemo.data.network;

import com.rugemo.data.network.model.StarWarsCharacter;

import java.util.List;

import io.reactivex.Single;

public interface RestApi {
    Single<List<StarWarsCharacter>> getCharacterList();
}
