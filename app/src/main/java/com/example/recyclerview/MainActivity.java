package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList<String> listaZakupow =new LinkedList<>();

    private void przygotujListe(){
        listaZakupow.addLast("mleko");
        listaZakupow.addLast("masło");
        listaZakupow.addLast("śmietana");
        listaZakupow.addLast("chleb");
        listaZakupow.addLast("bułki");
        listaZakupow.addLast("woda");
        listaZakupow.addLast("sok");
        listaZakupow.addLast("ser");
        listaZakupow.addLast("indyk");
        listaZakupow.addLast("jaja");
        listaZakupow.addLast("ryż");
        listaZakupow.addLast("mąka");
        listaZakupow.addLast("sól");
        listaZakupow.addLast("jabłka");
        listaZakupow.addLast("śliwki");
        listaZakupow.addLast("marchewki");
        listaZakupow.addLast("pietruszka");
        listaZakupow.addLast("por");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przygotujListe();
    }
}