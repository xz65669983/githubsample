package com.example.zzc.mycoolweather;


import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView findview = findview(R.id.tv_hw);
         findview.setText("不在HEllo world");
        Student<String> student=new Student<String>("hehehe");
        Log.i(TAG,student.toString());
    }
    public <T> T findview(@IdRes int id ){

             T view= (T) findViewById(id);
        return view;
    }

    class  Student<V>{
        V v;
        Student(V v){
            this.v=v;
        }

        @Override
        public String toString() {
            return v.toString();
        }
    }
}
