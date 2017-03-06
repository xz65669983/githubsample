package com.zzc.picassosamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class MainActivity extends AppCompatActivity {
    static String tarauri="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488796220872&di=87933ec52da50994f56ecdcbe10f1810&imgtype=0&src=http%3A%2F%2Fimg.idol001.com%2Forigin%2F2015%2F08%2F07%2Fcdf65386d244df8b0c16651ebff229371438910568.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_click = (Button) findViewById(R.id.bt_click);
        final ImageView iv_tara= (ImageView) findViewById(R.id.iv_tara);
        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.with(MainActivity.this).load(tarauri)
                        .into(iv_tara);
            }
        });

    }
}
