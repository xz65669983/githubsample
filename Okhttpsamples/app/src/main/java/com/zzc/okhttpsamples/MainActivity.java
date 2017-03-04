package com.zzc.okhttpsamples;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    private TextView tv_frombaidu;
    private EditText ed_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_frombaidu = (TextView) findViewById(R.id.tv_frombaidu);
        ed_url = (EditText) findViewById(R.id.ed_url);

    }
    public void jumpToOhter(View v){
        Intent intent =new Intent(this,WebActivity.class);
        String text = ed_url.getText().toString();
        Log.i(TAG,text);
        intent.putExtra("url",text);
        startActivity(intent);

    }
    public void getBaidu(View v)  {
        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://www.baidu.com")
                        .build();
                // Execute the request and retrieve the response.
                Response response = null;
                try {
                    response = client.newCall(request).execute();
                    ResponseBody body = response.body();
                    String s = body.string();
                    showString(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    private void showString(final String s) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tv_frombaidu.setText(s);
            }
        });
    }
}
