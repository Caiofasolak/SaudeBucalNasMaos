package com.example.saudebucalnasmaos;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AftasFragmentSS extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aftas_s_s, container, false);

        Button sim = (Button) view.findViewById(R.id.sim);
        sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new AftasFragmentSSS());
                fragmentTransaction.commit();
            }
        });

        Button nao = (Button) view.findViewById(R.id.nao);
        nao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new AftasFragmentSSN());
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}