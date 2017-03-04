package com.zzc.gsonprase;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickPrase(View v) {
        new Thread() {
            @Override
            public void run() {
                OkHttpClient client = new OkHttpClient();

                // Create request for remote resource.
                Request request = new Request.Builder()
                        .url("http://192.168.5.24/data.json")
                        .build();
                Response response = null;
                try {
                    response = client.newCall(request).execute();
                    ResponseBody body = response.body();
//
                   String bodystring= body.string();
                    Log.i(TAG,bodystring);
                    Gsonprase(bodystring);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }.start();


    }

    private void Gsonprase(String json) {
        Gson gson = new Gson();
        List<APP> applist = gson.fromJson(json, new TypeToken<List<APP>>() {
        }.getType());
        for (APP app : applist) {
            Log.i(TAG, app.getName());
            Log.i(TAG, app.getVersion());
            Log.i(TAG, String.valueOf(app.getId()));
        }

    }
    public void clickPrase2(View v){
        new Thread() {
            @Override
            public void run() {
                OkHttpClient client = new OkHttpClient();

                // Create request for remote resource.
                Request request = new Request.Builder()
                        .url("http://192.168.5.24/dataclass.json")
                        .build();
                Response response = null;
                try {
                    response = client.newCall(request).execute();
                    ResponseBody body = response.body();
                    Gsonprase2(body.string());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }.start();
    }
    private void Gsonprase2(String json) {
        Gson gson = new Gson();
        Item item = gson.fromJson(json, Item.class);
        Log.i(TAG,item.toString());

    }
}

