package com.example.tareatienda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.tareatienda.adaptadores.AdaptadorNivel;
import com.example.tareatienda.adaptadores.AdaptadorPadre;
import com.example.tareatienda.clases.Hijo;
import com.example.tareatienda.clases.Nivel;
import com.example.tareatienda.clases.Padre;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PadreActivity extends AppCompatActivity {
    RecyclerView rv_padre_clases;
    int id=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padre);

        rv_padre_clases=findViewById(R.id.rv_padre_clases);
        Intent i = getIntent();
        id=i.getIntExtra("id",1);
        CargarPadre(id);
    }

    void CargarPadre(int id){
        Retrofit retrofit = new Retrofit.Builder()
                //https://viveyupi.com/api/categorias/nivel/1
                .baseUrl("https://viveyupi.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Categorias cnivel = retrofit.create(Categorias.class);
        Call<List<Hijo>> servicio = cnivel.obtenerPadre(id);
        servicio.enqueue(new Callback<List <Hijo>>() {
            @Override
            public void onResponse(Call<List <Hijo>> call, Response<List <Hijo>> response) {

                switch (response.code()){
                    case 200:
                        AdaptadorPadre adaptadorNivel=
                                new AdaptadorPadre(PadreActivity.this,R.layout.itempadres,response.body());
                        rv_padre_clases.setAdapter(adaptadorNivel);
                        rv_padre_clases.setLayoutManager(new LinearLayoutManager(PadreActivity.this));

                }


            }
            @Override
            public void onFailure(Call<List <Hijo>> call, Throwable t) {
            }
        });



    }
}
