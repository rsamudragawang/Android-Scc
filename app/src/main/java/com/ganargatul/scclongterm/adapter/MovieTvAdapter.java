package com.ganargatul.scclongterm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ganargatul.scclongterm.R;
import com.ganargatul.scclongterm.item.MovieTvItems;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MovieTvAdapter extends RecyclerView.Adapter<MovieTvAdapter.MovieTvViewHolder> {
    Context mContext;
    ArrayList<MovieTvItems> mMovieTvItems = new ArrayList<>();

    public MovieTvAdapter(Context mContext, ArrayList<MovieTvItems> mMovieTvItems) {
        this.mContext = mContext;
        this.mMovieTvItems = mMovieTvItems;
    }

    @NonNull
    @Override
    public MovieTvAdapter.MovieTvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item,parent,false);
        return new MovieTvViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieTvAdapter.MovieTvViewHolder holder, int position) {
        MovieTvItems items = mMovieTvItems.get(position);
        holder.txt.setText(items.getTitle());
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+items.getPoster()).into(holder.photo);
    }

    @Override
    public int getItemCount() {
        return mMovieTvItems.size();
    }

    public class MovieTvViewHolder extends RecyclerView.ViewHolder {
        public TextView txt;
        public ImageView photo;
        public MovieTvViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.tv_judul);
            photo = itemView.findViewById(R.id.img_item);

        }
    }
}
