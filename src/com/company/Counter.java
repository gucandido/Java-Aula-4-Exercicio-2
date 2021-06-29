package com.company;

public class Counter {

    private int numeroAtual;

    public Counter() {

    }

    public Counter(int numeroAtual) {
        this.numeroAtual = numeroAtual;
    }

    Counter(Counter c){

        this.numeroAtual = c.numeroAtual;

    }

    public int add(){
        this.numeroAtual++;
        return this.numeroAtual;
    }

    public int subtrair(){
        this.numeroAtual--;
        return this.numeroAtual;
    }

    public int getNumeroAtual() {
        return numeroAtual;
    }

    public void setNumeroAtual(int numeroAtual) {
        this.numeroAtual = numeroAtual;
    }
}
