package com.xinzy.multiadapter.model;

import com.xinzy.multiadapter.adapter.MultiAdapter;

/**
 * Created by shaozeng.yang on 2017/9/26.
 */

public class Anim implements MultiAdapter.ViewType {
    public String type;

    public Anim(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Anim{" + "type='" + type + '\'' + '}';
    }

    @Override
    public Object getItemType() {
        return 2;
    }
}
