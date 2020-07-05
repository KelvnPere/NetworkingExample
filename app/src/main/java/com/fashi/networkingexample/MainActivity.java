package com.fashi.networkingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fashi.networkingexample.adapter.RepositoryAdapter;
import com.fashi.networkingexample.model.Repository;
import com.fashi.networkingexample.model.RepositoryList;
import com.fashi.networkingexample.retrofit.Api;
import com.fashi.networkingexample.retrofit.RetrofitClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Repository> repositorieList;
    private RecyclerView recyclerView;
    private RepositoryAdapter repositoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getRepositoryData();
    }

    private void getRepositoryData() {
        Api api = RetrofitClient.getApiService();
        Call<RepositoryList> call = api.getmyData();

        call.enqueue(new Callback<RepositoryList>() {
            @Override
            public void onResponse(Call<RepositoryList> call, Response<RepositoryList> response) {
                if (response.isSuccessful()) {

                    repositorieList = response.body().getRepositories();
                    recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
                    repositoryAdapter = new RepositoryAdapter(repositorieList);
                    RecyclerView.LayoutManager eLayoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(eLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(repositoryAdapter);
                }
            }

            @Override
            public void onFailure(Call<RepositoryList> call, Throwable t) {

            }
        });

    }
}
