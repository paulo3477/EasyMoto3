package com.example.paulosouza.easymoto3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by paulosouza on 03/08/2017.
 */

public class Despesas extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle instance) {
        super.onCreate(instance);
        setContentView(R.layout.adicionar_despesa);

        setInicial();
    }

    private void setInicial() {
        Spinner spinner = (Spinner) findViewById(R.id.spinner_despesa);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, new String[]{"Combustivel", "Peças", "Outras despesas"});
        spinner.setAdapter(adapter);

        final TextView vGasolina = (TextView) findViewById(R.id.textview_gasolina);
        final EditText gasolina = (EditText) findViewById(R.id.id_qtd_gasolina);
        final TextView vObservacao = (TextView) findViewById(R.id.textview_observacao);
        final EditText observacao = (EditText) findViewById(R.id.id_observacao);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch ((int) id) {
                    case 0:
                        vGasolina.setVisibility(View.VISIBLE);
                        gasolina.setVisibility(view.VISIBLE);
                        vObservacao.setVisibility(View.INVISIBLE);
                        observacao.setVisibility(view.INVISIBLE);
                        break;
                    default:
                        vObservacao.setVisibility(View.VISIBLE);
                        observacao.setVisibility(view.VISIBLE);
                        vGasolina.setVisibility(View.INVISIBLE);
                        gasolina.setVisibility(view.INVISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                return;
            }
        });
    }


}
