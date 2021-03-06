package com.example.arreglos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    Button distrito,anexos,atras;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        distrito=(Button) findViewById(R.id.btnDistrito);
        anexos=(Button) findViewById(R.id.btnAnexos);
        atras=(Button) findViewById(R.id.btnAtras);
        spinner=(Spinner) findViewById(R.id.Spinner);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent retr = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(retr);
            }
        });

        distrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity2.this,R.array.distritos, android.R.layout.simple_list_item_1);
                spinner.setAdapter(adapter);
            }
        });

        anexos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity2.this,R.array.anexos, android.R.layout.simple_list_item_1);
                spinner.setAdapter(adapter);
            }
        });

    }
}