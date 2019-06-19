package com.rugemo.data.network.model;

import androidx.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;


@JsonDeserialize
public class StarWarsCharacter {
    @JsonProperty("name")
    private String name;

    @JsonProperty("height")
    private String height;

    @JsonProperty("mass")
    private String mass;

    @JsonProperty("hair_color")
    private String hairColor;

    @JsonProperty("skin_color")
    private String skinColor;

    @JsonProperty("eye_color")
    private String eyeColor;

    @JsonProperty("birth_year")
    private String birthYear;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("films")
    @Nullable
    private List<Film> films;

    @JsonProperty("species")
    @Nullable
    private List<Species> species;

    @JsonProperty("vehicles")
    @Nullable
    private List<Vehicle> vehicles;

    @JsonProperty("starships")
    @Nullable
    private List<Starship> starships;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    @Nullable
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(@Nullable List<Film> films) {
        this.films = films;
    }

    @Nullable
    public List<Species> getSpecies() {
        return species;
    }

    public void setSpecies(@Nullable List<Species> species) {
        this.species = species;
    }

    @Nullable
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(@Nullable List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Nullable
    public List<Starship> getStarships() {
        return starships;
    }

    public void setStarships(@Nullable List<Starship> starships) {
        this.starships = starships;
    }

    @JsonDeserialize
    private class Film {

        @JsonProperty("title")
        private String title;


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    @JsonDeserialize
    private class Species {

        @JsonProperty("name")
        private String name;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @JsonDeserialize
    private class Vehicle {

        @JsonProperty("name")
        private String name;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @JsonDeserialize
    private class Starship {

        @JsonProperty("name")
        private String name;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

