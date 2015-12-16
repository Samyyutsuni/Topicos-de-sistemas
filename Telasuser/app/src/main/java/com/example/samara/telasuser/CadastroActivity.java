package com.example.samara.telasuser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    EditText edtUser, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtUser = (EditText) findViewById(R.id.editNome);
        edtSenha = (EditText) findViewById(R.id.eSsenha);

    }

    public void Cadastra(View view) {
        String nome = edtUser.getText().toString();
        String senha = edtSenha.getText().toString();

        Intent saida = new Intent(getBaseContext(), MainActivity.class);

        Bundle b = new Bundle();
        b.putString("nome", nome);
        b.putString("senha", senha);

        saida.putExtras(b);
        startActivity(saida);
    }
}
