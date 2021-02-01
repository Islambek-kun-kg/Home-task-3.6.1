package com.example.hw361;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentForHideAndShow extends Fragment {
    private Button btnHide, btnShow;

    public FragmentForHideAndShow() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_for_hide_and_show, container, false);
        btnHide = v.findViewById(R.id.btnHide);
        btnShow = v.findViewById(R.id.btnShow);
        btnHide.setOnClickListener(v1 -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            if (mainActivity != null) {
                mainActivity.Hide();
            }
        });
        btnShow.setOnClickListener(v1 -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            if (mainActivity != null) {
                mainActivity.Show();
            }
        });
        return v;
    }
}