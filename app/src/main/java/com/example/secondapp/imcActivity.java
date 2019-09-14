package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class imcActivity extends AppCompatActivity {

    EditText peso, altura;
    TextView resultado;
    ImageView image;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        peso = findViewById(R.id.editTextPeso);
        altura = findViewById(R.id.editTextAltura);
        resultado = findViewById(R.id.textViewIMC);
        image = findViewById(R.id.imageViewIMC);
        botao = findViewById(R.id.buttonCalcular);
    }

    public void calcularImc(View view) {
        Float pes = Float.parseFloat(peso.getText().toString());
        Float alt = Float.parseFloat(altura.getText().toString());
        double result = pes / Math.pow(alt, 2);

        resultado.setText(String.format("%.0f",result));
    }
}
