package com.mobileapps.retrofitwithmvvm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesAdapter.ViewHolder>
{
    List<Hero> heroes;

    public HeroesAdapter(List<Hero> heroes) {
        this.heroes = heroes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hero_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hero hero = heroes.get(position);
        Picasso.get().load(hero.getImageurl()).into(holder.imgHero);
        holder.tvName.setText(hero.getName());
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgHero;
        public TextView  tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHero = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView);
        }
    }
}
