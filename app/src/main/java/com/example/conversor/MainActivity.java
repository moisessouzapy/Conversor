package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void realParaDolar(View view) {
        Intent in = new Intent(MainActivity.this, realParaDolar.class);
        startActivity(in);
    }

    public void dolarParaReal(View view) {
        Intent in = new Intent(MainActivity.this, dolarParaReal.class);
        startActivity(in);
    }

    public void sair(View view)
    {
        finishAffinity();
    }


}