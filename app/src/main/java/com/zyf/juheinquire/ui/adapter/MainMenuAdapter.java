package com.zyf.juheinquire.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zyf.juheinquire.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by zyf on 16/5/19.
 */
public class MainMenuAdapter extends BaseAdapter implements View.OnClickListener {

    private List<String> functions;

    private Context context;

    public MainMenuAdapter(Context context) {
        functions = new ArrayList<>();
        this.context = context;
        functions.add("快递查询");
        functions.add("违章查询");
    }

    @Override
    public int getCount() {
        return functions.size();
    }

    @Override
    public Object getItem(int position) {
        return functions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_menu_list, null);
        }
        ((TextView) convertView.findViewById(R.id.tv_menu)).setText(functions.get(position));
        convertView.setTag(position);
        convertView.setOnClickListener(this);
        return convertView;
    }

    public void addFunction(String function) {
        functions.add(function);
        notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
    }
}
