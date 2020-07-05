package com.fashi.networkingexample.retrofit;

import com.fashi.networkingexample.model.Repository;
import com.fashi.networkingexample.model.RepositoryList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

   //GET
   @GET("/search/repositories?q=android+language:kotlin&sort=stars&order=desc")
    Call<RepositoryList> getmyData();
}
