package com.example.vee.git;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class custom extends BaseAdapter{
    private int id;
    private Context context;

    public custom(Context ctx, int id){
        this.context = ctx;
        this.id = id;

    }

    @Override
    public int getCount() {
        return 0;

    }

    @Override
    public Object getItem(int position) {
      return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
