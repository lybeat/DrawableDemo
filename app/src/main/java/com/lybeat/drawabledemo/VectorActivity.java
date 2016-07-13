package com.lybeat.drawabledemo;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Author: lybeat
 * Date: 2016/7/13
 */
public class VectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector);

        ImageView vectorImg = (ImageView) findViewById(R.id.vector_img);
        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) vectorImg.getDrawable();
        drawable.start();
    }
}
