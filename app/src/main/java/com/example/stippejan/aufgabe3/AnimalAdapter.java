package com.example.stippejan.aufgabe3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    public ArrayList<Animal> animalList = new ArrayList<>();

    public AnimalAdapter(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public AnimalAdapter.AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal, parent, false);
        AnimalViewHolder vh = new AnimalViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalAdapter.AnimalViewHolder holder, int position) {
        Animal a = animalList.get(position);
        holder.picture.setImageResource(a.getDrawableId());
        holder.species.setText(a.getSpeciesStringId());
        holder.age.setText(Integer.toString(a.getAge()));
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public static class AnimalViewHolder extends RecyclerView.ViewHolder {

        ImageView picture;
        TextView species;
        TextView age;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);

            picture = (ImageView) itemView.findViewById(R.id.a_drawable);
            species = (TextView) itemView.findViewById(R.id.a_species);
            age = (TextView) itemView.findViewById(R.id.a_age);
        }
    }
}
