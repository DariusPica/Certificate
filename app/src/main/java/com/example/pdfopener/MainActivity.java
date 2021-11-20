package com.example.pdfopener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;


public class MainActivity extends AppCompatActivity
{


    Button btnDarius;

    Button btnAlice;
    Button btnDespina;
    Button btnDaniel;
    Button btnLucia;
    Button btnCostel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDarius=findViewById(R.id.buttonDarius);
        btnAlice=findViewById(R.id.buttonAlice);
        btnDespina=findViewById(R.id.buttonDespina);
        btnDaniel=findViewById(R.id.buttonDaniel);
        btnLucia=findViewById(R.id.buttonLucia);
        btnCostel=findViewById(R.id.buttonCostel);



        btnDarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(MainActivity.this, PDFActivity.class);
                myIntent.putExtra("nume","darius");
                MainActivity.this.startActivity(myIntent);

            }
        });

        btnAlice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(MainActivity.this, PDFActivity.class);
                myIntent.putExtra("nume","alice");
                MainActivity.this.startActivity(myIntent);

            }
        });

        btnDespina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(MainActivity.this, PDFActivity.class);
                myIntent.putExtra("nume","despina");
                MainActivity.this.startActivity(myIntent);

            }
        });

        btnDaniel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(MainActivity.this, PDFActivity.class);
                myIntent.putExtra("nume","daniel");
                MainActivity.this.startActivity(myIntent);

            }
        });

        btnLucia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(MainActivity.this, PDFActivity.class);
                myIntent.putExtra("nume","lucia");
                MainActivity.this.startActivity(myIntent);

            }
        });


        btnCostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(MainActivity.this, PDFActivity.class);
                myIntent.putExtra("nume","costel");
                MainActivity.this.startActivity(myIntent);

            }
        });



    }


}