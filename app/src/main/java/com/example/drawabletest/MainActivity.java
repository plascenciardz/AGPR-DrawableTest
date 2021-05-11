package com.example.drawabletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView miImagen;
    Button incrementar;
    Button decrementar;
    int nivel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miImagen = findViewById(R.id.imagen);
        incrementar = findViewById(R.id.btn_mas);
        decrementar = findViewById(R.id.btn_menos);
        decrementar.setEnabled(false);

    }

    public void decrementarBateria(View view) {
        if(nivel > 0) {
            nivel--;
            if(nivel == 0) {
                view.setEnabled(false);
            }
            if(!incrementar.isEnabled()) {
                incrementar.setEnabled(true);
            }
            miImagen.getBackground().setLevel(nivel);
            //miImagen.setImageLevel(nivel);
        }
    }

    public void incrementarBateria(View view) {
        if(nivel < 4) {
            nivel++;
            if(nivel == 4) {
                view.setEnabled(false);
            }
            if(!decrementar.isEnabled()) {
                decrementar.setEnabled(true);
            }
            miImagen.getBackground().setLevel(nivel);
            //miImagen.setImageLevel(nivel);
        }
    }

}