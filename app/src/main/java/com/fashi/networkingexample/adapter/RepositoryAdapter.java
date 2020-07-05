package com.fashi.networkingexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.fashi.networkingexample.R;
import com.fashi.networkingexample.model.Repository;

import java.util.List;

public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.CustomViewHolder> {
    private List<Repository> repositories;

    public RepositoryAdapter(List<Repository> repositories) {
        this.repositories = repositories;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Repository reposs = repositories.get(position);
        holder.repositoryName.setText(reposs.getName());
//        holder.repoDescribtion.setText(reposs.getAuthors());
//        holder.repoUrl.setText(reposs.getStars());
}

    @Override
    public int getItemCount() {
            return repositories.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView repositoryName, repoDescribtion, repoUrl;

        public CustomViewHolder(View view) {
            super(view);
            repositoryName = view.findViewById(R.id.repoName);
//            repoName = view.findViewById(R.id.repositoryName);
//            repoDescribtion = view.findViewById(R.id.repoDescription);
////            repoUrl = view.findViewById(R.id.repoUrl);
        }
    }
}