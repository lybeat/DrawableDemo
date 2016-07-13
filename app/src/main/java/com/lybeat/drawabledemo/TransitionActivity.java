package com.lybeat.drawabledemo;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Author: lybeat
 * Date: 2016/7/3
 */
public class TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        ImageView img = (ImageView) findViewById(R.id.transition_img);
        TransitionDrawable transitionDrawable = (TransitionDrawable) img.getDrawable();
        if (transitionDrawable != null) {
            transitionDrawable.startTransition(5000);
        }
    }
}
