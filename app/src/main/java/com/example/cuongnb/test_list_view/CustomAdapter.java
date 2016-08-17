package com.example.cuongnb.test_list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cuongnb on 8/17/16.
 */
public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<Persion> persions;

    public CustomAdapter(Context context, ArrayList<Persion> persions) {
        this.context = context;
        this.persions = persions;
    }

    @Override
    public int getCount() {
        return persions.size();
    }

    @Override
    public Object getItem(int position) {
        return persions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater infater = LayoutInflater.from(context);
        view = infater.inflate(R.layout.item, null);
        Persion persion = persions.get(position);
        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        TextView tvAge = (TextView) view.findViewById(R.id.tvAge);

        tvName.setText(persion.name);
        tvAge.setText(persion.age + "");

        return view;
    }
}
