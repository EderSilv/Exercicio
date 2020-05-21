package com.example.exercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    private TextView VResu, VQu, VSl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        VQu=findViewById(R.id.textView5);
        VSl=findViewById(R.id.textView6);
        VResu=findViewById(R.id.Text2);

        String VARes, VASalario, VaNome;

        Bundle bundle = getIntent().getExtras();
        VASalario = bundle.getString("salario");
        VaNome = bundle.getString("nome");
        VARes = bundle.getString("Resultado");
        VQu.setText("O salário bruto é: " + VASalario);
        VSl.setText("Seu nome: " + VaNome);
        VResu.setText("Salário líquido:" + VARes);
    }




}
