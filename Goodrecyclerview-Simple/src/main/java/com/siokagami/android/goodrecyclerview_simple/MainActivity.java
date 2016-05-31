package com.siokagami.android.goodrecyclerview_simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.siokagami.android.goodrecyclerview.GoodRecyclerView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void initView()
    {
        GoodRecyclerView goodRecyclerView = (GoodRecyclerView)findViewById(R.id.goodsimple); //init view
        goodRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));//add LayoutManager

        /**
         * If your recyclerview need get data from network.Please define your adapter
         * as public variable .And use notifyDataSetChanged() to refresh.
         */
        GSAdapter gsAdapter = new GSAdapter();
        goodRecyclerView.setAdapter(gsAdapter);
        /**
         * If your RecyclerView need paging request to get data from the network,
         * please add the following code.
         */
        goodRecyclerView.setOnLoadDataListener(new GoodRecyclerView.OnLoadDataListener() {
            @Override
            public void onLoadData(int page) {
                //add your code
            }
        });
        goodRecyclerView.startLoadData(); // start load data
    }
}
