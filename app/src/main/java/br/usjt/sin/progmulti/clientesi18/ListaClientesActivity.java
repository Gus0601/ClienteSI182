package br.usjt.sin.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class ListaClientesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.BUSCA);
    }
    private ArrayList<String> clientes(){
        ArrayList<String> lista = new ArrayList<>();

        return lista;
    }
}
