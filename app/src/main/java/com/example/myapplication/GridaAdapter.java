package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridaAdapter extends BaseAdapter {
    Context context;
    Pokemon [] pokemons;
    int []images;

    LayoutInflater inflater;

    public GridaAdapter(Context context, Pokemon[] pokemons, int[] images) {
        this.context = context;
        this.pokemons = pokemons;
        this.images = images;
    }

    @Override
    public int getCount() {
        return pokemons.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){

            convertView = inflater.inflate(R.layout.row_items,null);

        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = convertView.findViewById(R.id.item_name);

        imageView.setImageResource(images[position]);
        textView.setText(pokemons[position].getNom());
        return convertView;
    }
}
