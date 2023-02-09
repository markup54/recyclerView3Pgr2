package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList<Produkt> listaZakupow =new LinkedList<>();
    RecyclerView recyclerView;
    ZakupyAdapter adapter;

    private void przygotujListe(){
        listaZakupow.addLast(new Produkt("mleko"));
        listaZakupow.addLast(new Produkt("masło"));
        listaZakupow.addLast(new Produkt("śmietana"));
        listaZakupow.addLast(new Produkt("chleb"));
        listaZakupow.addLast(new Produkt("bułki"));
        listaZakupow.addLast(new Produkt("woda"));
        listaZakupow.addLast(new Produkt("sok"));
        listaZakupow.addLast(new Produkt("ser"));
        listaZakupow.addLast(new Produkt("indyk"));
        listaZakupow.addLast(new Produkt("jaja"));
        listaZakupow.addLast(new Produkt("ryż"));
        listaZakupow.addLast(new Produkt("mąka"));
        listaZakupow.addLast(new Produkt("sól"));
        listaZakupow.addLast(new Produkt("jabłka"));
        listaZakupow.addLast(new Produkt("śliwki"));
        listaZakupow.addLast(new Produkt("marchewki"));
        listaZakupow.addLast(new Produkt("pietruszka"));
        listaZakupow.addLast(new Produkt("por"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przygotujListe();
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new ZakupyAdapter(this,listaZakupow);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}