package com.example.shashank.crud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class SpinnerAdapter extends BaseAdapter {
    private int[] imgs={R.drawable.car,R.drawable.banner1,R.drawable.slide1,R.drawable.slide2,
            R.drawable.slide3,R.drawable.slide4,R.drawable.banner1};
    private Context context;
    public SpinnerAdapter(Context context){

        this.context=context;
    }
    @Override
    public int getCount() {

        return imgs.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View item= LayoutInflater.from(context).inflate(R.layout.item_image,viewGroup,false);
        ImageView img=item.findViewById(R.id.img);
        img.setImageResource(imgs[position]);
        return item;
    }
}
