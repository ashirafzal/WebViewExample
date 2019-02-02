package com.example.ashirafzal.iulms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebView = (WebView) findViewById(R.id.webView);
        mywebView.getSettings().setJavaScriptEnabled(true);
        mywebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mywebView.setWebViewClient(new WebViewClient());
        mywebView.loadUrl("https://developer.android.com/");
    }

    @Override
    public void onBackPressed() {
        if(mywebView.canGoBack()){
            mywebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
