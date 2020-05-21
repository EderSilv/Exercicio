package com.example.exercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Textt, EdiiText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Textt=findViewById(R.id.EdText);
        EdiiText=findViewById(R.id.EdiText);

    }

    public void Calcular(View Calc){
        double VRes, VBrut, VLiq;
        String VResu, VSalario, txtNome;
        VBrut= Double.parseDouble(Textt.getText().toString());
        txtNome = EdiiText.getText().toString();

        VRes = VBrut - (VBrut * 8.5 / 100);
        VLiq = VRes - (VRes * 12.5 / 100);
        VSalario = Double.toString(VBrut);
        VResu = Double.toString(VLiq);

        Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
        intent.putExtra("Resultado",VResu);
        intent.putExtra("nome",txtNome );
        intent.putExtra("salario", VSalario);
        startActivity(intent);
    }

}
