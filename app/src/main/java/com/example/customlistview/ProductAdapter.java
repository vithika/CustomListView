package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;

public class ProductAdapter extends ArrayAdapter<Product> {

    private  final Context context;
    private  final ArrayList<Product> values;

    public ProductAdapter(Context context, ArrayList<Product> list) {
        super(context, R.layout.row_layout,list);
        this.context = context;
        this.values = list;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview=inflater.inflate(R.layout.row_layout,parent,false);

        TextView tvproduct=(TextView)rowview.findViewById(R.id.tvproduct);
        TextView tvprice=(TextView)rowview.findViewById(R.id.tvprice);
        TextView tvdescription=(TextView)rowview.findViewById(R.id.tvdescription);

        ImageView ivproduct=(ImageView)rowview.findViewById(R.id.ivproduct);
        ImageView ivsales=(ImageView)rowview.findViewById(R.id.ivsale);

        tvproduct.setText(values.get(position).getTitle());
        tvprice.setText("R"+values.get(position).getPrice());
        tvdescription.setText(values.get(position).getDescription());

        if(values.get(position).getSale())
        {
            ivsales.setImageResource(R.mipmap.sale);
        }
        else {
            ivsales.setImageResource(R.mipmap.best_price);
        }
        if(values.get(position).getType().equals("Laptop"))
        {
            ivproduct.setImageResource(R.mipmap.laptop);
        }
        else if( values.get(position).getType().equals("Memory"))
        {
            ivproduct.setImageResource(R.mipmap.memory);
        }
        else  if(values.get(position).getType().equals("Screen"))
        {
            ivproduct.setImageResource(R.mipmap.screen);
        }
        else {
            ivproduct.setImageResource(R.mipmap.hdd);
        }


        return rowview;
    }
}
