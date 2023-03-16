package com.example.pr4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ButtonsFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.buttons_frg, container, false);

        Button btn1 = view.findViewById(R.id.FragBtn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                getParentFragmentManager().beginTransaction().replace(container.getId(), ListViewFragment.class, null).commit();
            }
        });

        Button btn2 = view.findViewById(R.id.FragBtn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                getParentFragmentManager().beginTransaction().replace(container.getId(), RecycleViewFragment.class, null).commit();
            }
        });

        return view;
    }
}
