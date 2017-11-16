package com.saludo.everis.vinculacionservicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView  resultado ;
    private Button  btnsumar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         // Lo convierte a un objeto
        resultado = (TextView) findViewById(R.id.textViewResultado);
        btnsumar = (Button) findViewById(R.id.buttonSumar);





        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                resultado.setText("Hola desde la clase java");
            }
        });

    }
}
