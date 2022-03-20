package com.example.tuan5demo;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterDonut extends BaseAdapter {
    Context context;
    int layout;
    List<Donut> donutList;

    public AdapterDonut(Context context, int layout, List<Donut> donutList) {
        this.context = context;
        this.layout = layout;
        this.donutList = donutList;
    }

    @Override
    public int getCount() {
        return donutList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public class ViewHolder{
        TextView txtName, txtNote, txtMoney;
        ImageView imgImage;
        ImageButton btnImage;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            viewHolder = new ViewHolder();
            viewHolder.txtName = convertView.findViewById(R.id.txtName);
            viewHolder.txtNote = convertView.findViewById(R.id.txtNote);
            viewHolder.txtMoney = convertView.findViewById(R.id.txtMoney);
            viewHolder.imgImage = convertView.findViewById(R.id.imgImage);
            viewHolder.btnImage = convertView.findViewById(R.id.btnImg);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.txtName.setText(donutList.get(position).txtName);
        viewHolder.txtNote.setText(donutList.get(position).txtNote);
        viewHolder.txtMoney.setText(donutList.get(position).txtMoney);
        viewHolder.imgImage.setImageResource(donutList.get(position).imgImage);
        return convertView;
    }
}
