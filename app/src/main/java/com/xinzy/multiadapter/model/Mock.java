package com.xinzy.multiadapter.model;

import android.view.View;

import com.xinzy.multiadapter.adapter.MultiAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by shaozeng.yang on 2017/9/26.
 */

public class Mock {


    public static final String[] NAMES = {"Jim", "Tom", "Jerry", "Lily", "Lucy", "Kate", "Gate", "Rand", "Math",
                    "Newer", "Good", "Guess", "Sound"};

    public static final String[] ANIMS = {"Dog", "Cat", "Pig", "Rabbit", "Snake", "Goo", "Duck", "Tiger",
                    "Mouse", "Cow", "Dragon", "Horse"};


    public static List<MultiAdapter.ViewType> any() {

        final int random = random(10);
        List<MultiAdapter.ViewType> list = new ArrayList<>();

        for (int i = 0; i < random; i++) {
            list.add(one());
        }

        return list;
    }

    public static MultiAdapter.ViewType one() {
        switch (random(2)) {
            case 0:
                int rand = random(NAMES.length);
                return new User(rand, NAMES[rand]);
            case 1:
            default:
                return new Anim(ANIMS[random(ANIMS.length)]);
        }
    }

    private static int random(int size) {
        return (int) (Math.random() * size);
    }
}
