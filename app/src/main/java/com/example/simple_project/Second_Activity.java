package com.example.simple_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        WebView mywebview = (WebView) findViewById(R.id.WebView);
        mywebview.loadUrl("https://poltekssn.ac.id/");
    }
}