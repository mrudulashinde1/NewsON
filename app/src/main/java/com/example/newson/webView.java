package com.example.newson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toolbar;

public class webView extends AppCompatActivity {
    Toolbar atoolbar;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_web_view);

        //atoolbar=findViewById(R.id.toolbar);
        //setSupportActionBar(atoolbar);
        webView=findViewById(R.id.webview);

        Intent intent=getIntent();
        String url=intent.getStringExtra("url");

        webView.loadUrl(url);

    }
}