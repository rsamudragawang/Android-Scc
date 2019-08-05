package com.ganargatul.scclongterm.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ganargatul.scclongterm.item.MovieTvItems;

import java.util.ArrayList;

public class MovieTvAdapter extends RecyclerView.Adapter<MovieTvAdapter.MovieTvViewHolder> {
    Context mContext;
    ArrayList<MovieTvItems> mMovieTvItems = new ArrayList<>();


    @NonNull
    @Override
    public MovieTvAdapter.MovieTvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieTvAdapter.MovieTvViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mMovieTvItems.size();
    }

    public class MovieTvViewHolder extends RecyclerView.ViewHolder {
        public MovieTvViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
