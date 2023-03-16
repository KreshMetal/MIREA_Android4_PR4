package com.example.pr4;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ComixCardAdapter extends ArrayAdapter<ComixCard>
{
    private LayoutInflater inflater;
    private int layout;
    private List<ComixCard> cards;

    public ComixCardAdapter(@NonNull Context context, int resource, @NonNull List<ComixCard> objects)
    {
        super(context, resource, objects);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        this.cards = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = inflater.inflate(layout, parent, false);

        TextView name = (TextView) view.findViewById(R.id.ComicCardName);
        TextView desc = (TextView) view.findViewById(R.id.ComicCardDesc);
        ImageView logo = (ImageView) view.findViewById(R.id.ComixCardLogo);

        ComixCard card = cards.get(position);

        name.setText(card.getName());
        desc.setText(card.getDesc());
        logo.setImageResource(card.getLogo());

        return view;
    }
}
