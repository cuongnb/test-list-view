package com.example.cuongnb.test_list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvListView = (ListView) findViewById(R.id.lvListView);

        ArrayList<Persion> persions = new ArrayList<Persion>();
        persions.add(new Persion("aa", 12));
        persions.add(new Persion("bb", 13));
        persions.add(new Persion("cc", 14));
        persions.add(new Persion("dd", 15));

        CustomAdapter adapter = new CustomAdapter(this, persions);
        lvListView.setAdapter(adapter);
    }
}
