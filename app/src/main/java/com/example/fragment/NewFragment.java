package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NewFragment extends Fragment {



    public NewFragment() {
        // Required empty public constructor
    }
    RecyclerView recyclerView;
List<Model> itemlist;





    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_new,container,false);
        recyclerView=(RecyclerView) view.findViewById(R.id.recycler);

        recyclerView.setHasFixedSize(true);

      recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new ItemAdapter(initData()));
        return view;
    }

    private List<Model> initData() {
        itemlist=new ArrayList<>();
        itemlist.add(new Model(R.drawable.donate,"one"));
        itemlist.add(new Model(R.drawable.donate,"one"));
        itemlist.add(new Model(R.drawable.donate,"one"));
        return itemlist;
    }


}