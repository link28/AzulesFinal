package edu.itchii.plat2.azulesfinal;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {
    webview webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.activity_web);

        WebView myWebView = (WebView) this.findViewById(R.id.web);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("http://qualityinnchihuahua.com/");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }

}