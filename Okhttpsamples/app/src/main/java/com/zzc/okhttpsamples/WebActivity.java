package com.zzc.okhttpsamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by zzc on 2017/3/2.
 */

public class WebActivity extends AppCompatActivity {
    private static final String TAG = "WebActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView wv_website = (WebView) findViewById(R.id.wv_website);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        String newurl=url.startsWith("https://")? url:new StringBuffer().append("https://").append(url).toString();
        Log.d(TAG,newurl);
        wv_website.getSettings().setJavaScriptEnabled(true);
        wv_website.setWebViewClient(new WebViewClient());
        wv_website.loadUrl(newurl);

    }


}
