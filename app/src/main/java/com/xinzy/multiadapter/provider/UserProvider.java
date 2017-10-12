package com.xinzy.multiadapter.provider;

import android.widget.TextView;

import com.xinzy.multiadapter.R;
import com.xinzy.multiadapter.adapter.MultiAdapter;
import com.xinzy.multiadapter.model.User;

/**
 * Created by shaozeng.yang on 2017/9/26.
 */

public class UserProvider extends MultiAdapter.ItemProvider<User> {

    private static final String TAG = "UserProvider";

    @Override
    public void onBindViewHolder(MultiAdapter.MultiViewHolder viewHolder, User data, int position) {
        TextView textView = viewHolder.get(R.id.userText);
        textView.setText(position + ": id=" + data.id + "; name=" + data.name);
    }

    @Override
    protected int getItemViewLayoutId() {
        return R.layout.item_user;
    }
}
