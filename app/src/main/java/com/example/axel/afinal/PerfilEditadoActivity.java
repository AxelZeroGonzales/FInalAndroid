package com.example.axel.afinal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class PerfilEditadoActivity extends Fragment {



    View view;
    Button mBtn;
    public static EditText mENombre,mEEdad,mEDeporte,mETelefono;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_perfileditado, container, false);


        return view;
    }
}