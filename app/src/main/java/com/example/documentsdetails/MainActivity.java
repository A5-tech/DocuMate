package com.example.documentsdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent goPdf = new Intent(MainActivity.this,PdfViewer.class);
        Button passport = findViewById(R.id.passport);
        Button aadhaar = findViewById(R.id.aadhaar);
        Button voter = findViewById(R.id.voter);
        Button birth = findViewById(R.id.birth);
        Button domicile = findViewById(R.id.domicile);
        Button income = findViewById(R.id.income);

        passport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPdf.putExtra("file_name","passport.pdf");
                startActivity(goPdf);
            }
        });

        aadhaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPdf.putExtra("file_name","aadhaar.pdf");
                startActivity(goPdf);
            }
        });

        voter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPdf.putExtra("file_name","voter.pdf");
                startActivity(goPdf);
            }
        });

        birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPdf.putExtra("file_name","birth_certificate.pdf");
                startActivity(goPdf);
            }
        });

        domicile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPdf.putExtra("file_name","domicile.pdf");
                startActivity(goPdf);
            }
        });

        income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPdf.putExtra("file_name","income.pdf");
                startActivity(goPdf);
            }
        });
    }
}