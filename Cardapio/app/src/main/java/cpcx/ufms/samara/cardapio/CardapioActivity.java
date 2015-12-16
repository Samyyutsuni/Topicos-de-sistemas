package cpcx.ufms.samara.cardapio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CardapioActivity extends AppCompatActivity {
    ListView lv;
    private Cardapio[] cardapio1 = {
            new Cardapio("misto quente", "pão, queijo, presunto", 3.00),
            new Cardapio("x salada", "hambúrguer, queijo, tomate e alface", 7.00),
            new Cardapio("x burguer", "hambúrguer,queijo, tomate e cebola", 7.00),
            new Cardapio("x burguer especial", "hambúrguer com queijo provolone derretido, rúcula, tomate seco com molho de catchup e mostarda.", 10.00),
            new Cardapio("x burguer americano", "hambúrguer com queijo cheddar, alface americana, parmesão e molho caesar.", 12.50),
            new Cardapio("x búrguer duplo", "2 hambúrgueres, queijo, tomate e alface.", 13.00),
            new Cardapio("x burguer cheddar", "duplo queijo cheddar, catchup com hambúrguer,tomate e alface.", 13.50),
            new Cardapio("x barbecue", "hambúrguer, queijo prato derretido, bacon crocante, cebola grelhada, e molho barbecue.", 14.00),
            new Cardapio("x tudo", "hambúrguer, queijo-prato, tomate, alface, ovo, salsicha, bacon e presunto.", 14.50),
            new Cardapio("x tudo duplo", "2 hambúrgueres, queijo-prato, tomate, alface, ovo, salsicha, bacon e presunto.", 15.00),
            new Cardapio("x filet", "filet mignon e queijo.", 15.50),
            new Cardapio("x filet salada", "filet mignon, queijo, alface picado e tomate.", 15.50),
            new Cardapio("x filet bacon", "filet mignon, bacon, queijo, alface picado e tomate.", 15.50)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);
        lv = (ListView)findViewById(R.id.lvCardaPio);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, android.R.id.text1, cardapio1);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getBaseContext(),tela2cardapio.class);
                Bundle b = new Bundle();
                b.putSerializable("lanche",cardapio1[position]);

                i.putExtras(b);
                startActivity(i);


            }
        });

    }
}
