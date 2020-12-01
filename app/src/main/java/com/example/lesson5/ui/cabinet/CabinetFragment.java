package com.example.lesson5.ui.cabinet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.lesson5.R;
import com.example.lesson5.ui.home.HomeViewModel;

public class CabinetFragment extends Fragment {

    private HomeViewModel homeViewModel;
    View root;
    TextView t_home;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       root = inflater.inflate(R.layout.fragment_cabinet, container, false);
       t_home = root.findViewById(R.id.t_home);
       t_home.setText("Text changed");


        return root;
    }
}