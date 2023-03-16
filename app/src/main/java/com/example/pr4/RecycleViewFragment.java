package com.example.pr4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewFragment extends Fragment
{
    private static final String TAG = "Recycle";
    public static ArrayList<ComixCard> cards;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.recycle_list_frg, container, false);

        InitList();

        RecyclerView lst = (RecyclerView) view.findViewById(R.id.RecycleList);

        ComixCardAdapterR.OnCardClickListener comixCardListener = new ComixCardAdapterR.OnCardClickListener()
        {
            @Override
            public void onCardClick(ComixCard card, int position)
            {
                Toast.makeText(getActivity().getApplicationContext(), card.getName(), Toast.LENGTH_SHORT).show();
                Log.d(TAG, card.getName());
            }
        };

        ComixCardAdapterR adapterR = new ComixCardAdapterR(getActivity().getApplicationContext(), cards, comixCardListener);
        lst.setAdapter(adapterR);

        return view;
    }

    private void InitList()
    {
        cards = new ArrayList<>();
        for (int i = 0; i < 200; i++)
        {
            cards.add(new ComixCard("Тест" + Integer.toString(i), "Тест", R.drawable.ic_android_black_24dp));
        }
    }
}
