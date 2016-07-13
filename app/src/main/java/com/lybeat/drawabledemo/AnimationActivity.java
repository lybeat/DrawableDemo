package com.lybeat.drawabledemo;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Author: lybeat
 * Date: 2016/6/18
 */
public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        ImageView animationImg = (ImageView) findViewById(R.id.animation_img);
        AnimationDrawable drawable = (AnimationDrawable) animationImg.getDrawable();
        drawable.start();
    }
}
