package com.fashi.networkingexample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RepositoryList {
    @SerializedName("items")
    @Expose
    private ArrayList<Repository> repositories = null;

    public ArrayList<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(ArrayList<Repository> repositories) {
        this.repositories = repositories;
    }
}
