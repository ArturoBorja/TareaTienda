package com.example.tareatienda.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareatienda.PadreActivity;
import com.example.tareatienda.R;

public class NivelHolder extends RecyclerView.ViewHolder {
    Context context;
    CardView cv;
    ImageView img;
    TextView txt;
    int id;


    public NivelHolder(@NonNull View itemView, Context c) {
        super(itemView);
        this.context=c;
        cv=itemView.findViewById(R.id.cv_itemclases_clase);
        img=itemView.findViewById(R.id.img_itemclases_banner);
        txt=itemView.findViewById(R.id.txt_itemclases_descripcion);
        cv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intent = new Intent(context, PadreActivity.class);
                intent.putExtra("id",id);
                context.startActivity(intent);
                return true;
            }
        });
    }
}
