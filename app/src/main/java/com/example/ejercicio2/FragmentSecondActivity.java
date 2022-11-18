package com.example.ejercicio2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentSecondActivity extends Fragment {

    public FragmentSecondActivity() {
        // Required empty public constructor
    }

    public static FragmentSecondActivity newInstance(String param1, String param2) {
        FragmentSecondActivity fragment = new FragmentSecondActivity();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_activity, container, false);
    }
}