package com.xinzy.multiadapter.provider;

import android.widget.TextView;

import com.xinzy.multiadapter.R;
import com.xinzy.multiadapter.adapter.MultiAdapter;
import com.xinzy.multiadapter.model.Anim;

/**
 * Created by shaozeng.yang on 2017/9/26.
 */

public class AnimProvider extends MultiAdapter.ItemProvider<Anim> {

    private static final String TAG = "AnimProvider";

    @Override
    public void onBindViewHolder(MultiAdapter.MultiViewHolder viewHolder, Anim data, int position) {
        TextView textView = viewHolder.get(R.id.animText);
        textView.setText(position + ": " + data.type);
    }

    @Override
    protected int getItemViewLayoutId() {
        return R.layout.item_anim;
    }
}
