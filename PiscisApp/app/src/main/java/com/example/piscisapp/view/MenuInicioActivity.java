package com.example.piscisapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.piscisapp.R;

public class MenuInicioActivity extends AppCompatActivity implements View.OnClickListener{

    //Atributos

    //Botones
    private Button btnComerciales;
    private Button btnRepartidores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Llamada al metodo de la clase padre para inicializar correctamente
        super.onCreate(savedInstanceState);
        //Instancia la intefaz definida en el layout de activity_menu_inicio
        setContentView(R.layout.activity_menu_inicio);

        //Enlazamos con los widgets del layout
        btnComerciales = findViewById(R.id.btn_comerciales);
        btnRepartidores = findViewById(R.id.btn_repartidores);

        //Asigna los listenerspara los botones
        btnComerciales.setOnClickListener(this);
        btnRepartidores.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_comerciales) {
            setContentView(R.layout.activity_menu_password_comerciales);
        } else {
            setContentView(R.layout.activity_menu_password_repartidores);
        }
    }
}