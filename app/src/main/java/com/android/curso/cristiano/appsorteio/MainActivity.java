package com.android.curso.cristiano.appsorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtResultadoSorteio;
    private int numSorte = 0;
    private int numSorteAux = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {
        txtResultadoSorteio = (TextView) findViewById(R.id.txtResultSort);
        Random random = new Random();
        numSorte = random.nextInt(11);
        while (numSorte == numSorteAux) {
            numSorte = random.nextInt(11);
            if (numSorte == 10) {
                numSorte -= 1;
            } else  {
                numSorte += 1;
            }
        }
        txtResultadoSorteio.setText("O número sorteado é " + numSorte);
        numSorteAux = numSorte;
    }
}
