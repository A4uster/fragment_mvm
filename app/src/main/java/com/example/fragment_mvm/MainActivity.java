package com.example.fragment_mvm;

import androidx.appcompat.app.AppCompatActivity;

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
        //PASO 2
        mBtnCarregarFragment1 = findViewById(R.id.BTN_Fragment1);
        mBtnCarregarFragment2 = findViewById(R.id.BTN_Fragment2);


        //Paso 3
        mBtnCarregarFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Carregem el fragment 1

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FL_ContingutFragments, new Fragment1()).commit();

            }

        });
        mBtnCarregarFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FL_ContingutFragments, new Fragment2()).commit();
            }
        });
    }


}