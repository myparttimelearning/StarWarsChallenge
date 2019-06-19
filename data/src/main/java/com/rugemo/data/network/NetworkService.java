package com.rugemo.data.network;

import com.rugemo.data.network.model.StarWarsCharacter;
import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
public interface NetworkService {
    /**
     * @return Observable feed response
     */
    @GET("people/")
    Single<List<StarWarsCharacter>> getCharacterList();

}

