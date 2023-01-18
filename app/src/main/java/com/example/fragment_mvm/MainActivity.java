package com.example.fragment_mvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //PASO 1
    private Button mBtnCarregarFragment1, mBtnCarregarFragment2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializem la variable de tipus ModelView
        mItemModelView = new ViewModelProvider(this).get(itemModelView.class);

        //Consultem el valor de ViewModel
        mItemModelView.getDadesLiveData().observe(this.itemObservat -> {
            mTvDadesCompartides.setText(itemObservat);
        });

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.FL_ContingutFragments, new Fragment1()).commit();

        //PASO 2
        mBtnCarregarFragment1 = findViewById(R.id.BTN_Fragment1);
        mBtnCarregarFragment2 = findViewById(R.id.BTN_Fragment2);


        //Paso 3
        mBtnCarregarFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarFragment(new Fragment1());
                /*
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FL_ContingutFragments, new Fragment1()).commit();*/

            }

        });
        mBtnCarregarFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarFragment(new Fragment2());
                /*
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FL_ContingutFragments, new Fragment2()).commit();*/
            }
        });
    }
    private void CarregarFragment (Fragment Fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.FL_ContingutFragments, Fragment).commit();
    }


}