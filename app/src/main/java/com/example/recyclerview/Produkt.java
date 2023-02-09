package com.example.recyclerview;

public class Produkt {
    private String nazwa;
    private boolean zaznaczone;

    public Produkt(String nazwa) {
        this.nazwa = nazwa;
        zaznaczone = false;
    }

    @Override
    public String toString() {
        return  nazwa ;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isZaznaczone() {
        return zaznaczone;
    }

    public void setZaznaczone(boolean zaznaczone) {
        this.zaznaczone = zaznaczone;
    }
}
