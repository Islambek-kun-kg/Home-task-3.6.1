package com.example.hw361;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentAddToList extends Fragment {
    private Button btnAdd, btnHide, btnShow;
    private IFragment iFragment;
    private EditText edtTxt;
    private View v;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        iFragment = (IFragment) context;
    }

    @Override
    public View onCreateView(LayoutInflater f, ViewGroup c, Bundle s) {
        v = f.inflate(R.layout.fragment_add_to_list, c, false);
        btnAdd = v.findViewById(R.id.btnAdd);
        btnHide = v.findViewById(R.id.btnHide);
        btnShow = v.findViewById(R.id.btnShow);
        edtTxt = v.findViewById(R.id.edtTxt);
        btnAdd.setOnClickListener(v1 -> {
            String txt = edtTxt.getText().toString();
            MainActivity mainActivity = (MainActivity) getActivity();
            if (mainActivity != null) {
                mainActivity.AddToList(txt);
            }
        });
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