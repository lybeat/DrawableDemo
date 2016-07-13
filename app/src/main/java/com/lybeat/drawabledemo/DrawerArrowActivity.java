package com.lybeat.drawabledemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: lybeat
 * Date: 2016/7/13
 */
public class DrawerArrowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_arrow);

        final DrawerArrowDrawable drawable = new DrawerArrowDrawable(this);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setCustomView(R.layout.action_bar);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ImageView arrowImg = (ImageView) actionbar.getCustomView().findViewById(R.id.action_arrow_img);
        arrowImg.setImageDrawable(drawable);
        arrowImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!drawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    drawerLayout.openDrawer(Gravity.LEFT);
                } else {
                    drawerLayout.closeDrawer(Gravity.LEFT);
                }
            }
        });
        actionbar.setDisplayHomeAsUpEnabled(false);
        actionbar.setDisplayShowTitleEnabled(false);
        actionbar.setDisplayShowCustomEnabled(true);
        actionbar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        drawerLayout.setDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                drawable.setProgress(slideOffset);
            }
        });
        List<Map<String, String>> menus = getData();
        SimpleAdapter adapter = new SimpleAdapter(this, menus, R.layout.item_txt,
                new String[] {"menu"}, new int[] {R.id.item_txt});
        ListView drawerList = (ListView) findViewById(R.id.drawer_list);
        drawerList.setAdapter(adapter);

    }

    public List<Map<String,String>> getData() {
        List<Map<String, String>> menus = new ArrayList<>();
        Map<String, String> menu = new HashMap<>();
        menu.put("menu", "动画");
        menus.add(menu);
        menu = new HashMap<>();
        menu.put("menu", "漫画");
        menus.add(menu);
        menu = new HashMap<>();
        menu.put("menu", "游戏");
        menus.add(menu);
        menu = new HashMap<>();
        menu.put("menu", "小说");
        menus.add(menu);

        return menus;
    }
}
