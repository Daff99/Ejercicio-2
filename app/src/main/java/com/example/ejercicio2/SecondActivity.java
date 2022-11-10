package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class SecondActivity extends AppCompatActivity {

    private FrameLayout fl;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fl = findViewById(R.id.frameLayout);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        FragmentSecondActivity imagen = new FragmentSecondActivity();
        transaction.replace(R.id.frameLayout, imagen);
        transaction.commit();

        fl.setVisibility(View.INVISIBLE);

        boton = (Button)findViewById(R.id.button_image);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fl.getVisibility() == View.INVISIBLE)
                    fl.setVisibility(View.VISIBLE);
                else
                    fl.setVisibility(View.INVISIBLE);
            }
        });
    }
}