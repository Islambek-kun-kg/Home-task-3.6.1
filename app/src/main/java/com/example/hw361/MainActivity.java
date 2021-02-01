package com.example.hw361;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements IFragment {
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.fragmentForList);
    }

    @Override
    public void AddToList(String txt) {
        manager = getSupportFragmentManager();
        FragmentForList fragment = (FragmentForList) manager.findFragmentById(R.id.fragmentForList);
        transaction = manager.beginTransaction();
        fragment.setText(txt);
    }

    @Override
    public void Hide() {
        linearLayout.setVisibility(View.INVISIBLE);
    }

    @Override
    public void Show() {
        linearLayout.setVisibility(View.VISIBLE);
    }
}