package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultado, operacion;
    // numeros
    private Button boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;

    // Aritmetica
    private Button botonSuma, botonResta, botonMulti, botonDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado= (TextView) findViewById(R.id.Resultado);
        operacion= (TextView) findViewById(R.id.Operacion);

        boton0= (Button) findViewById(R.id.boton0);
        boton1= (Button) findViewById(R.id.boton1);
        boton2= (Button) findViewById(R.id.boton2);
        boton3= (Button) findViewById(R.id.boton3);
        boton4= (Button) findViewById(R.id.boton4);
        boton5= (Button) findViewById(R.id.boton5);
        boton6= (Button) findViewById(R.id.boton6);
        boton7= (Button) findViewById(R.id.boton7);
        boton8= (Button) findViewById(R.id.boton8);
        boton9= (Button) findViewById(R.id.boton9);

        botonSuma  = (Button) findViewById(R.id.BotonSuma);
        botonResta = (Button) findViewById(R.id.BotonResta);
        botonDiv   = (Button) findViewById(R.id.BotonDiv);
        botonMulti = (Button) findViewById(R.id.BotonMulti);

        boton0.setOnClickListener(v-> operacion.setText(operacion.getText()+"0"));
        boton1.setOnClickListener(v-> operacion.setText(operacion.getText()+"1"));
        boton2.setOnClickListener(v-> operacion.setText(operacion.getText()+"2"));
        boton3.setOnClickListener(v-> operacion.setText(operacion.getText()+"3"));
        boton4.setOnClickListener(v-> operacion.setText(operacion.getText()+"4"));
        boton5.setOnClickListener(v-> operacion.setText(operacion.getText()+"5"));
        boton6.setOnClickListener(v-> operacion.setText(operacion.getText()+"6"));
        boton7.setOnClickListener(v-> operacion.setText(operacion.getText()+"7"));
        boton8.setOnClickListener(v-> operacion.setText(operacion.getText()+"8"));
        boton9.setOnClickListener(v-> operacion.setText(operacion.getText()+"9"));

        botonSuma.setOnClickListener(v->{
            int r=Integer.parseInt(resultado.getText().toString())+Integer.parseInt(operacion.getText().toString());
            resultado.setText(String.valueOf(r));
            operacion.setText("0");
        });

        botonResta.setOnClickListener(v->{
            int r=Integer.parseInt(resultado.getText().toString())-Integer.parseInt(operacion.getText().toString());
            resultado.setText(String.valueOf(r));
            operacion.setText("0");
        });

        botonMulti.setOnClickListener(v->{
            int r=Integer.parseInt(resultado.getText().toString())*Integer.parseInt(operacion.getText().toString());
            resultado.setText(String.valueOf(r));
            operacion.setText("0");
        });

        botonDiv.setOnClickListener(v->{
            int r=Integer.parseInt(resultado.getText().toString())/Integer.parseInt(operacion.getText().toString());
            resultado.setText(String.valueOf(r));
            operacion.setText("0");
        });

    }

}
