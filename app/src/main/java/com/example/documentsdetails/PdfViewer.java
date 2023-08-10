package com.example.documentsdetails;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent i = getIntent();
        String file_name = i.getStringExtra("file_name");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);
        PDFView pdf = findViewById(R.id.pdfView);
        pdf.fromAsset(file_name).load();
    }
}