package com.example.tareatienda.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tareatienda.clases.Hijo;

import java.util.List;

public class AdaptadorPadre extends RecyclerView.Adapter<NivelHolder> {
    Context context;
    int layout;
    List<Hijo> datos;
    LayoutInflater layoutInflater;

    public AdaptadorPadre(Context context, int layout, List<Hijo> datos) {
        this.context = context;
        this.layout = layout;
        this.datos = datos;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public NivelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(layout,parent,false);
        return new NivelHolder(v,context);
    }

    @Override
    public void onBindViewHolder(@NonNull NivelHolder holder, int position) {
        holder.txt.setText(datos.get(position).getDescripcion());
        Glide.with(context).load(datos.get(position).getImagen_cuadrada()).into(holder.img);
        holder.id=datos.get(position).getId();
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
