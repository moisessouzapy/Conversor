package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class dolarParaReal extends AppCompatActivity {

    private EditText realEdit1;
    private EditText cotacaoEdit1;
    private TextView resultadoD1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_para_dolar);

        realEdit1 = findViewById(R.id.editReal);
        cotacaoEdit1 = findViewById(R.id.cotacaoEditReal);
        resultadoD1= findViewById(R.id.resultadoDolar);
    }

    public void converter (View view){
        double qntDolar1 = Double.parseDouble(realEdit1.getText().toString());
        double cotacaoReal1 = Double.parseDouble(cotacaoEdit1.getText().toString());
        double resultado1 = qntDolar1 * cotacaoReal1;

        resultadoD1.setText("Valor Convertido em R$: " + resultado1);
    }
}