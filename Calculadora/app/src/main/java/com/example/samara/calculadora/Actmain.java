package com.example.samara.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Actmain extends AppCompatActivity   {

    private EditText edtValor1;
    private EditText edtValor2;
    private Button btnCalcular;
    private Button btnSomar;
    private Button btnSubtrair;
    private Button btnMultiplicar;
    private Button btnDividir;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);


        edtValor1= (EditText)findViewById(R.id.editValor1);
        edtValor2= (EditText)findViewById(R.id.editValor2);
        tvResult=(TextView)findViewById(R.id.tvResul);

    }

    public void somar(View view){
        int v1=Integer.parseInt(edtValor1.getText().toString());
        int v2=Integer.parseInt(edtValor2.getText().toString());
        tvResult.setText("a soma e "+(v1+v2));

    }

    public void divide(View view){

        int v1=Integer.parseInt(edtValor1.getText().toString());
        int v2=Integer.parseInt(edtValor2.getText().toString());
        tvResult.setText("a divisao  e "+(v1/v2));

    }
    public void multiplica(View view){

        int v1=Integer.parseInt(edtValor1.getText().toString());
        int v2=Integer.parseInt(edtValor2.getText().toString());
        tvResult.setText("a multiplicacão e "+(v1*v2));

    }
    public void subtrai(View view){
        int v1=Integer.parseInt(edtValor1.getText().toString());
        int v2=Integer.parseInt(edtValor2.getText().toString());
        tvResult.setText("a subtracão e "+(v1-v2));

    }
}
