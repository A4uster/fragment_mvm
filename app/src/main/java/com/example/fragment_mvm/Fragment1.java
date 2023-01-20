package com.example.fragment_mvm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Fragment1 extends Fragment {

    private EditText mEtDadesPerCompartirFrg;
    private TextView mTvDadesCompartidesFrg;
    private Button mBtnCompartirDadesFrg;

    private itemModelView mItemModelViewFrg;

    public Fragment1() {
        // Required empty public constructor priority

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_1, container, false);

        View v = inflater.inflate(R.layout.fragment_1, container, false);

        mEtDadesPerCompartirFrg = v.findViewById(R.id.TV_dades_Per_EnviarFrg1);
        mBtnCompartirDadesFrg = v.findViewById(R.id.BTN_EnviarDadesFrg1);
        mTvDadesCompartidesFrg = v.findViewById(R.id.TV_dades_rebudesFrg1);
        mItemModelViewFrg = new ViewModelProvider();

        mBtnCompartirDadesFrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mTvDadesCompartidesFrg.setText(mEtDadesPerCompartirFrg.getText().toString()
                );
                mItemModelViewFrg.setDadesLiveData(mEtDadesPerCompartirFrg.getText().toString());
            }
        });

        return v;
    }
}