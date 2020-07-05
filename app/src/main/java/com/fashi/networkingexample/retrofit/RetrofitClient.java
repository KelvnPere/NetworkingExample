package com.fashi.networkingexample.retrofit;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.fashi.networkingexample.Util.BASE_URL;


public class RetrofitClient {

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    // Create a Retrofit Instance

     public static Api getApiService() {
        return getRetrofitInstance().create(Api.class);
    }
}
