package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class realParaDolar extends AppCompatActivity {

    private EditText realEdit;
    private EditText cotacaoEdit;
    private TextView resultadoD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar_para_real);

        realEdit = findViewById(R.id.editDolar);
        cotacaoEdit = findViewById(R.id.cotacaoEditDolar);
        resultadoD= findViewById(R.id.resultadoReal);

    }
    public void converter (View view){
        double qntDolar = Double.parseDouble(realEdit.getText().toString());
        double cotacaoReal = Double.parseDouble(cotacaoEdit.getText().toString());
        double resultado = qntDolar * cotacaoReal;

        resultadoD.setText("Valor Convertido em R$: " + resultado);
    }
}