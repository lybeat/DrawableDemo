package com.lybeat.drawabledemo;

import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Author: lybeat
 * Date: 2016/6/16
 */
public class LevelActivity extends AppCompatActivity {

    private LevelListDrawable drawable;
    private ImageView levelImg;

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        levelImg = (ImageView) findViewById(R.id.level_img);
        drawable = (LevelListDrawable) levelImg.getDrawable();
        handler.sendEmptyMessage(0);
    }

    @Override
    protected void onDestroy() {
        handler.removeMessages(0);
        super.onDestroy();
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            drawable.setLevel(index++);
            if (index > 9) {
                index = 0;
            }
            sendEmptyMessageDelayed(0, 700);
        }
    };
}
