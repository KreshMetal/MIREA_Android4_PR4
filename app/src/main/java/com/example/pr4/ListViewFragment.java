package com.example.pr4;

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

import java.util.ArrayList;

public class ListViewFragment extends Fragment
{
    private static final String TAG = "ListView";
    public static ArrayList<ComixCard> cards;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.list_view_frg, container, false);

        InitList();

        ListView lst = (ListView) view.findViewById(R.id.ComixCardList);

        ComixCardAdapter adapter = new ComixCardAdapter(getActivity().getApplicationContext(), R.layout.comix_card, cards);
        lst.setAdapter(adapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                TextView name = view.findViewById(R.id.ComicCardName);
                Toast.makeText(getActivity().getApplicationContext(), name.getText().toString(), Toast.LENGTH_SHORT).show();
                Log.d(TAG, name.getText().toString());
            }
        };
        lst.setOnItemClickListener(itemListener);
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
