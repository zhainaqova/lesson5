package com.example.lesson5.ui.messages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.lesson5.R;
import com.example.lesson5.ui.home.HomeViewModel;

public class MessageFragment extends Fragment {

    private HomeViewModel homeViewModel;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }
}