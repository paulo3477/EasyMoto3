package com.example.paulosouza.easymoto3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by paulosouza on 03/08/2017.
 */

public class CorridaAvulsa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.adicionar_corrida_avulsa);

        setMascaraMonetaria();
    }

    private void setMascaraMonetaria() {
        EditText nVlrMoney = (EditText) findViewById(R.id.id_valor_corrida);
        nVlrMoney.addTextChangedListener(new Formato(nVlrMoney));
        nVlrMoney.setText("300");
    }


}
