package com.example.tareatienda;

import com.example.tareatienda.clases.Hijo;
import com.example.tareatienda.clases.Padre;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Categorias {
    @GET("categorias/nivel/{nivel}")
    Call<List<Padre>> obtenerNivel(@Path("nivel") int id);
    @GET("categorias/padre/{codigo}")
    Call<List<Hijo>> obtenerPadre(@Path("codigo") int id);
}
