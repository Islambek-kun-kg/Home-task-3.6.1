package com.example.hw361;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentForList extends Fragment {
    private RecyclerView recyclerView;
    private List<Item> list;
    private MainAdapter adapter;
    private Item item;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView);
        list=new ArrayList<>();
        adapter = new MainAdapter(list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater f, ViewGroup c, Bundle s) {
        return f.inflate(R.layout.fragment_for_list, c, false);
    }

    public void setText(String text) {
        list.add(new Item(text));
        adapter.notifyDataSetChanged();
    }
}