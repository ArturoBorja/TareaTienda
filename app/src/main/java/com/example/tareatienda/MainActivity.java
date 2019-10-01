package com.example.tareatienda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.tareatienda.adaptadores.AdaptadorNivel;
import com.example.tareatienda.clases.Nivel;
import com.example.tareatienda.clases.Padre;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_main_clases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_main_clases =findViewById(R.id.rv_main_clases);


        CargarNivel();
    }
    void CargarNivel(){
        Retrofit retrofit = new Retrofit.Builder()
                //https://viveyupi.com/api/categorias/nivel/1
                .baseUrl("https://viveyupi.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Categorias cnivel = retrofit.create(Categorias.class);
        Call<List <Padre>> servicio = cnivel.obtenerNivel(1);
        servicio.enqueue(new Callback<List <Padre>>() {
            @Override
            public void onResponse(Call<List <Padre>> call, Response<List <Padre>> response) {
                switch (response.code()){
                    case 200:
                        Nivel nivel = new Nivel();
                                nivel.setResults(response.body());
                        AdaptadorNivel adaptadorNivel=
                                new AdaptadorNivel(MainActivity.this,R.layout.itemclases,nivel.getResults());
                        rv_main_clases.setAdapter(adaptadorNivel);
                        rv_main_clases.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                }


            }
            @Override
            public void onFailure(Call<List <Padre>> call, Throwable t) {
            }
        });



    }
}
