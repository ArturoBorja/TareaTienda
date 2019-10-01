package com.example.tareatienda.clases;

import java.util.List;

public class Nivel {
    int count;
    List<Padre> results;
    public Nivel (){

    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setResults(List<Padre> results) {
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public List<Padre> getResults() {
        return results;
    }
}
