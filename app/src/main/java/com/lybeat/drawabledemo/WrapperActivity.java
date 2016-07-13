package com.lybeat.drawabledemo;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Author: lybeat
 * Date: 2016/7/13
 */
public class WrapperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrapper);

        TextView clipTxt = (TextView) findViewById(R.id.clip_txt);
        ClipDrawable clip = (ClipDrawable) clipTxt.getCompoundDrawables()[1];
        if (clip != null) {
            clip.setLevel(5000);
        }

        TextView scaleTxt = (TextView) findViewById(R.id.scale_txt);
        ScaleDrawable scale = (ScaleDrawable) scaleTxt.getCompoundDrawables()[1];
        if (scale != null) {
            scale.setLevel(5);
        }
    }
}
