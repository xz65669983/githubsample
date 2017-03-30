package com.example.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arrayListtest=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findview(R.id.main_listview);
        arrayListtest.add("呵呵0");
        arrayListtest.add("呵呵1");
        arrayListtest.add("呵呵2");
        arrayListtest.add("呵呵3");
        arrayListtest.add("呵呵4");
        arrayListtest.add("呵呵5");
        arrayListtest.add("呵呵6");
        arrayListtest.add("呵呵7");
        arrayListtest.add("呵呵8");
        arrayListtest.add("呵呵9");


        listView.setAdapter(new Madpatertest());
    }
       class Madpatertest extends BaseAdapter{

           @Override
           public int getCount() {
               return arrayListtest.size();
           }

           @Override
           public Object getItem(int position) {
               return null;
           }

           @Override
           public long getItemId(int position) {
               return 0;
           }

           @Override
           public View getView(int position, View convertView, ViewGroup parent) {
               View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.listviewtest, parent, false);
               TextView tv_test = (TextView) view.findViewById(R.id.tv_test);
               tv_test.setText(arrayListtest.get(position));
               return view;
           }
       }
    public <T> T findview(int id){
        T t= (T) findViewById(id);
        return t;
    }
}
