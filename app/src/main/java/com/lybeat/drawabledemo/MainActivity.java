package com.lybeat.drawabledemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Map<String, String>> drawables = getData();
        SimpleAdapter adapter = new SimpleAdapter(this, drawables, R.layout.item_txt,
                new String[] { "drawable" }, new int[] { R.id.item_txt});
        ListView drawableList = (ListView) findViewById(R.id.drawable_list);
        drawableList.setAdapter(adapter);
        drawableList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Class cls = RippleActivity.class;
                switch (position) {
                    case 0:
                        cls = LayerActivity.class;
                        break;
                    case 1:
                        cls = TransitionActivity.class;
                        break;
                    case 2:
                        cls = RippleActivity.class;
                        break;
                    case 3:
                        cls = StateListActivity.class;
                        break;
                    case 4:
                        cls = LevelActivity.class;
                        break;
                    case 5:
                        cls = AnimationActivity.class;
                        break;
                    case 6:
                        cls = ShapeActivity.class;
                        break;
                    case 7:
                        cls = WrapperActivity.class;
                        break;
                    case 8:
                        cls = VectorActivity.class;
                        break;
                    case 9:
                        cls = DrawerArrowActivity.class;
                        break;
                }
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, cls);
                startActivity(intent);
            }
        });
    }

    @NonNull
    private List<Map<String, String>> getData() {
        List<Map<String, String>> drawables = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("drawable", "LayerDrawable");
        drawables.add(map);
        map = new HashMap<>();
        map.put("drawable", "TransitionDrawable");
        drawables.add(map);
        map = new HashMap<>();
        map.put("drawable", "RippleDrawable");
        drawables.add(map);
        map = new HashMap<>();
        map.put("drawable", "StateListDrawable");
        drawables.add(map);
        map = new HashMap<>();
        map.put("drawable", "LevelListDrawable");
        drawables.add(map);
        map = new HashMap<>();
        map.put("drawable", "AnimationDrawable");
        drawables.add(map);
        map = new HashMap<>();
        map.put("drawable", "ShapeDrawable");
        drawables.add(map);
        map = new HashMap<>();
        map.put("drawable", "WrapperDrawable");
        drawables.add(map);
        map = new HashMap<>();
        map.put("drawable", "AnimatedVectorDrawable");
        drawables.add(map);
        map = new HashMap<>();
        map.put("drawable", "DrawerArrowDrawable");
        drawables.add(map);

        return drawables;
    }


}
