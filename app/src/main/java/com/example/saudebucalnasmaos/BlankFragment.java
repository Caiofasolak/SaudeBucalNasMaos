package com.example.saudebucalnasmaos;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BlankFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        Button traumaBtn = (Button) view.findViewById(R.id.traumatismo_button);
        traumaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new TraumaFragment());
                fragmentTransaction.commit();
            }
        });

        Button aftasBtn = (Button) view.findViewById(R.id.aftas_button);
        aftasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new AftasFragment());
                fragmentTransaction.commit();
            }
        });

        Button pericoronariteBtn = (Button) view.findViewById(R.id.pericoronarite_button);
        pericoronariteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new PericoronariteFragment());
                fragmentTransaction.commit();
            }
        });

        Button gengiviteBtn = (Button) view.findViewById(R.id.gengivite_button);
        gengiviteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new GengiviteFragment());
                fragmentTransaction.commit();
            }
        });

        Button trismoBtn = (Button) view.findViewById(R.id.trismo_button);
        trismoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new TrismoFragment());
                fragmentTransaction.commit();
            }
        });

        Button pulpiteBtn = (Button) view.findViewById(R.id.pulpite_button);
        pulpiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new CarieFragment());
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}