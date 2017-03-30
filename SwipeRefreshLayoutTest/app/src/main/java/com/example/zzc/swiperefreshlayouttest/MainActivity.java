package com.example.zzc.swiperefreshlayouttest;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ArrayList<String> marrayList=new ArrayList<>();
//    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwipeRefreshLayout swiperefresh = (SwipeRefreshLayout) findViewById(R.id.swiperefresh);
        ListView mlistview= (ListView) findViewById(R.id.listview);

        marrayList.add("c");
        marrayList.add("java");
        marrayList.add("c++");
        marrayList.add("php");
        marrayList.add("c#");


       mlistview.setAdapter(new Myadapter());
//        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,marrayList);
//        mlistview.setAdapter(mAdapter);
        swiperefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Log.i(TAG,"劳资刷新啦");
            }
        });

    }

    class Myadapter extends BaseAdapter{

        @Override
        public int getCount() {
            return marrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return marrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(MainActivity.this)
                    .//inflate(android.R.layout.simple_list_item_1, parent, false);
                    inflate(R.layout.listview, parent, false);

            TextView textview = (TextView) view.findViewById(R.id.tv_listview);
           textview.setText(marrayList.get(position));
            return view;
        }
    }
}
