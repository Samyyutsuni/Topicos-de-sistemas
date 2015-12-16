package com.example.samara.telasuser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.samara.telasuser.model.User;


public class MainActivity extends AppCompatActivity {
    EditText edtUser, edtSenha;
    public static User[] usuarios = new User[10];
    public int C = 0;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = (EditText) findViewById(R.id.edtUser);
        edtSenha = (EditText) findViewById(R.id.edtSenha);

        //parametro de tela//
        Intent intent = getIntent();

        // verificação de envio//

        //vericação de envio d mensagem (b.getString//
        Bundle b = intent.getExtras();
        if (b != null) {

            User f = new User();
            f.setNome(b.getString("nome"));
            f.setSenha(b.getString("senha"));

            usuarios[C] = f;
            C++;

        }

    }


    public void Cadastras(View view) {
        Intent intencao = new Intent(getBaseContext(), CadastroActivity.class);

        startActivity(intencao);
    }


    public void Login(View view) {
        Intent saida = new Intent(getBaseContext(), TelaboasvindasActivity.class);
        String nome, senha;
        nome = edtUser.getText().toString();
        senha = edtSenha.getText().toString();
        if (busca(nome, senha)) {
            Bundle b = new Bundle();
            b.putString("usuario", nome);
            saida.putExtras(b);
            startActivity(saida);
        } else {
            edtSenha.setText("");
            edtUser.setText("");

        }
    }

    public boolean busca(String nome, String senha) {
        boolean r = false;
        for (int i = 0; i < C; i++) {
            if (usuarios[i].getNome().equals(nome) && usuarios[i].getSenha().equals(senha)) {
                r= true;
                i=C;
            }
        }
        return r;
    }


}
