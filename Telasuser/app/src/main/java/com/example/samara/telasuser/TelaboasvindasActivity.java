package com.example.samara.telasuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TelaboasvindasActivity extends AppCompatActivity {
    TextView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaboasvindas);

        b = (TextView) findViewById(R.id.tv_boasvindas);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (intent.getExtras() != null) {

            String nome;
            nome = bundle.getString("usuario");
            b.setText(nome);


        }

    }

}
