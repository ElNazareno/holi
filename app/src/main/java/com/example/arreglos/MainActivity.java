package com.example.arreglos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button paises,departamentos,siguiente;
    ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paises=(Button)findViewById(R.id.btnPais);
        departamentos=(Button)findViewById(R.id.btnDepartamento);
        siguiente=(Button)findViewById(R.id.btnSiguiente);
        lista=(ListView)findViewById(R.id.lstLista);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intento);
            }
        });

        paises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.paises, android.R.layout.simple_list_item_1);
                lista.setAdapter(adapter);
            }
        });

        departamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.departamentos, android.R.layout.simple_list_item_1);
                lista.setAdapter(adapter);
            }
        });

    }




}