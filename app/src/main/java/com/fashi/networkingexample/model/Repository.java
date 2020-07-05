package com.fashi.networkingexample.model;

// Annotation Processing

import com.google.gson.annotations.SerializedName;

public class Repository {
    private int id;
    private String name;

    @SerializedName("full_name")
    private String authors;

    @SerializedName("watchers_count")
    private int stars;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
