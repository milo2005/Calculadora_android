package com.example.estacionvl_tc_014.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        EditText num1,num2;
    TextView resultado;
    Button sumar, restar, dividir, multiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        resultado = (TextView) findViewById(R.id.resultado);
        sumar = (Button) findViewById(R.id.sumar);
        restar = (Button) findViewById(R.id.restar);
        dividir = (Button) findViewById(R.id.div);
        multiplicar = (Button) findViewById(R.id.mul);

        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        multiplicar.setOnClickListener(this);

        if(savedInstanceState != null)
            resultado.setText(savedInstanceState.getString("valor"));


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString("valor", (String) resultado.getText());

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int ni1 = Integer.parseInt(n1);
        int ni2 = Integer.parseInt(n2);
        int rta = 0;

        switch(v.getId()){
            case R.id.sumar:
                rta = ni1 + ni2;
                break;
            case R.id.restar:
                rta = ni1 - ni2;
                break;
            case R.id.mul:
                rta = ni1 * ni2;
                break;
            case R.id.div:
                rta = ni1 / ni2;
                break;
        }

        resultado.setText(""+rta);

    }







}
