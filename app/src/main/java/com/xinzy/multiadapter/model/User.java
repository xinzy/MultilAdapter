package com.xinzy.multiadapter.model;

import com.xinzy.multiadapter.adapter.MultiAdapter;

/**
 * Created by shaozeng.yang on 2017/9/26.
 */

public class User implements MultiAdapter.ViewType {

    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public Object getItemType() {
        return 1;
    }
}
