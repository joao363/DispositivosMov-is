package com.example.sistemaempresarial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox cb10;
    CheckBox cb15;
    CheckBox cb20;

    Button btnCalcular;

    EditText edtHoras;
    EditText edtValorHora;
    EditText edtSalarioBruto;
    EditText edtTotalDesconto;
    EditText edtSalarioLiquido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb10 = (CheckBox) findViewById(R.id.cb10);
        cb15 = (CheckBox) findViewById(R.id.cb15);
        cb20 = (CheckBox) findViewById(R.id.cb20);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);
    }

    public void btnCalcularClick(View v){

        if(edtHoras.getText().length() > 0 && edtValorHora.getText().length() > 0){

            double n1 = Double.parseDouble(edtHoras.getText().toString());
            double n2 = Double.parseDouble(edtValorHora.getText().toString());

            if(cb10.isChecked()){
                double liquido = 0.0;
                double bruto = 0.0;
                double desconto = 0.0;
                double ValorDescontar = 0.0;

                bruto = n1 * n2;
                ValorDescontar = ((n1 * n2) * 0.10);
                liquido = ((n1 * n2) - ValorDescontar);
                desconto = bruto - liquido;

                edtSalarioBruto.setText("" + bruto);
                edtTotalDesconto.setText("" + desconto);
                edtSalarioLiquido.setText("" + liquido);

            }
            else if(cb15.isChecked()){
                double liquido = 0.0;
                double bruto = 0.0;
                double desconto = 0.0;
                double ValorDescontar = 0.0;

                bruto = n1 * n2;
                ValorDescontar = ((n1 * n2) * 0.15);
                liquido = ((n1 * n2) - ValorDescontar);
                desconto = bruto - liquido;

                edtSalarioBruto.setText("" + bruto);
                edtTotalDesconto.setText("" + desconto);
                edtSalarioLiquido.setText("" + liquido);

            }
            else if(cb20.isChecked()){
                double liquido = 0.0;
                double bruto = 0.0;
                double desconto = 0.0;
                double ValorDescontar = 0.0;

                bruto = n1 * n2;
                ValorDescontar = ((n1 * n2) * 0.30);
                liquido = ((n1 * n2) - ValorDescontar);
                desconto = bruto - liquido;

                edtSalarioBruto.setText("" + bruto);
                edtTotalDesconto.setText("" + desconto);
                edtSalarioLiquido.setText("" + liquido);
            }
            else{
                AlertDialog.Builder diag = new AlertDialog.Builder(this);
                diag.setTitle("Erro");
                diag.setMessage("Campos inválidos!");
                diag.setNeutralButton("OK", null);
                diag.show();
            }


        }


    }
}
