package com.ynryo.handios;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView handios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handios = findViewById(R.id.handios);
        handios.getSettings().setJavaScriptEnabled(true);
        handios.setWebViewClient(new WebViewClient());
        handios.loadUrl("https://handios-app.specstech.fr/");
    }
}