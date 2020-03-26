package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tipoAv(View view) {
        CheckBox checkBox =(CheckBox)view;
        boolean chequeado = checkBox.isChecked();
        String tipo ="";
        //Sobre que checbox se ha hecho click
        switch (view.getId()) {
            case R.id.checkBoxChapa:
                tipo ="Chapa";
                break;
            case R.id.checkBoxCristal:
                tipo ="Cristal";
                break;
            case R.id.checkBoxMecanica:
                tipo= "Averí mecánica";
                break;
        }
        Toast.makeText(this, tipo+" ("+chequeado+")", Toast.LENGTH_SHORT).show();
    }
}
