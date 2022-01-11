package com.pandjiaprillian.animalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.AnimalsViewHolder> {

    private ArrayList<Animal> listAnimal;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Animal data);
    }

    public AnimalsAdapter(ArrayList<Animal> list){
        this.listAnimal = list;
    }



    @NonNull
    @Override
    public AnimalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal, parent, false);
        return new AnimalsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AnimalsViewHolder holder, int position) {
        Animal animal = listAnimal.get(position);

        Glide.with(holder.itemView.getContext())
                .load(animal.getAnimalPhoto())
                .apply(new RequestOptions().override(88, 88))
                .into(holder.imgPhoto);

        holder.tvAnimalName.setText(animal.getAnimalName());
        holder.tvAnimalLatinName.setText(animal.getAnimalLatinName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listAnimal.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAnimal.size();
    }

    public class AnimalsViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvAnimalName, tvAnimalLatinName, tvAnimalDescription;

        public AnimalsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_animal_photo);
            tvAnimalName = itemView.findViewById(R.id.tv_animals_name);
            tvAnimalLatinName = itemView.findViewById(R.id.tv_animals_latin_name);
            tvAnimalDescription = itemView.findViewById(R.id.tv_animals_description_received);
        }
    }
}
