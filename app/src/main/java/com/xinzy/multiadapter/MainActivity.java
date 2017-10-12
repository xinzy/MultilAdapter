package com.xinzy.multiadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.xinzy.multiadapter.adapter.MultiAdapter;
import com.xinzy.multiadapter.model.Mock;
import com.xinzy.multiadapter.provider.AnimProvider;
import com.xinzy.multiadapter.provider.UserProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MultiAdapter.OnItemClickListener {
    private static final String TAG = "MultiAdapter";

    private RecyclerView mRecyclerView;
    private MultiAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MultiAdapter().registerProvider(1, new UserProvider())
                .registerProvider(2, new AnimProvider());
        mAdapter.setOnItemClickListener(this);
        mRecyclerView.setAdapter(mAdapter);

        List<MultiAdapter.ViewType> datas = Mock.any();
        Log.d(TAG, "onCreate: " + datas);

        mAdapter.addAll(datas);
    }


    public void addOne(View view) {
        MultiAdapter.ViewType type = Mock.one();
        mAdapter.add(type);
//        Log.d(TAG, "one: " + type);
//        Log.d(TAG, "all: " + mAdapter.getData());
    }

    public void addAny(View view) {
        mAdapter.addAll(Mock.any());
    }

    public void removeOne(View view) {
        mAdapter.remove(0);
    }

    public void replaceAll(View view) {
        mAdapter.replace(Mock.any());
    }

    public void clear(View view) {
        mAdapter.clear();
    }

    public void flush(View view) {
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(View view, int position) {
        Log.d(TAG, "onItemClick: " + position + ": " + mAdapter.getData().get(position));
    }
}
