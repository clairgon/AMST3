package com.example.asmt3;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton calendario, correo, mapa, video;
    ExtendedFloatingActionButton addActionsFab;

    Boolean isAllFABVisible;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendario = findViewById(R.id.calendario);
        correo =findViewById(R.id.correo);
        mapa =findViewById(R.id.mapa);
        video = findViewById(R.id.video);

        calendario.setVisibility(View.GONE);
        correo.setVisibility(View.GONE);
        mapa.setVisibility(View.GONE);
        video.setVisibility(View.GONE);

        isAllFABVisible =false;
        addActionsFab.shrink();

        addActionsFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isAllFABVisible){
                    calendario.show();
                    correo.show();
                    mapa.show();
                    video.show();

                    addActionsFab.extend();
                    isAllFABVisible=true;

                }else{
                    calendario.hide();
                    correo.hide();
                    mapa.hide();
                    video.hide();

                    addActionsFab.shrink();
                    isAllFABVisible=false;
                }
            }
        });
        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, CalendarViewActivity.class);
                startActivity(intent);
            }
        });
        correo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,CorreoView.class);
                startActivity(intent);
            }
        });
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,MapaView.class);
                startActivity(intent);
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,VideoView.class);
                startActivity(intent);
            }
        });
    }
}