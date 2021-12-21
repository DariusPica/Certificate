package com.example.pdfopener;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        Intent intent=getIntent();
        String value=intent.getStringExtra("nume");

        if(value.equals("darius"))
        {
            PDFView pdfView=findViewById(R.id.pdfView);
            pdfView.fromAsset("darius.pdf").pages(1).load();
        }

        if(value.equals("alice"))
        {
            PDFView pdfView=findViewById(R.id.pdfView);
            pdfView.fromAsset("alice.pdf").pages(1).load();
        }

        if(value.equals("despina"))
        {
            PDFView pdfView=findViewById(R.id.pdfView);
            pdfView.fromAsset("despina.pdf").pages(1).load();
        }

        if(value.equals("daniel"))
        {
            PDFView pdfView=findViewById(R.id.pdfView);
            pdfView.fromAsset("daniel.pdf").pages(1).load();
        }

        if(value.equals("lucia"))
        {
            PDFView pdfView=findViewById(R.id.pdfView);
            pdfView.fromAsset("lucia.pdf").pages(1).load();
        }

        if(value.equals("costel"))
        {
            PDFView pdfView=findViewById(R.id.pdfView);
            pdfView.fromAsset("costel.pdf").pages(1).load();
        }

        if(value.equals("luminita"))
        {
            PDFView pdfView=findViewById(R.id.pdfView);
            pdfView.fromAsset("luminita.pdf").pages(1).load();
        }


    }
}
