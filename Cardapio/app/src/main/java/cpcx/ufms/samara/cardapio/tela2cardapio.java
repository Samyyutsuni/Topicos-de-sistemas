package cpcx.ufms.samara.cardapio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class tela2cardapio extends AppCompatActivity {
    Intent i;
    Cardapio c;
    TextView lanches,ingred,preco;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2cardapio);
        lanches= (TextView)findViewById(R.id.tvnomedolanche);
        ingred=(TextView)findViewById(R.id.tvingredientes);
        preco=(TextView)findViewById(R.id.tvpreco);

        i=getIntent();
        Bundle b = i.getExtras();
        if(b!=null){
            c = (Cardapio)b.getSerializable("lanche");
            lanches.setText(c.nome);
            ingred.setText(c.ingredientes);
            preco.setText(c.VALOR+"");
        }

    }
}
