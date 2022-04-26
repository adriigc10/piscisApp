package com.example.piscisapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.piscisapp.R;
import com.example.piscisapp.model.connections.Conexion;


public class MenuLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login);
        Conexion.getLocalConnection();
    }
}