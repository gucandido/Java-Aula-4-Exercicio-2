package com.company;

import java.math.BigDecimal;

public class ContaCorrente {

    private String numero;
    private BigDecimal saldo;

    public ContaCorrente(){

    }

    public ContaCorrente(String numero, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    ContaCorrente(ContaCorrente conta) {
        this.numero = conta.numero;
        this.saldo = conta.saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }


    // metodos funcionais
    public void depositar(BigDecimal saldoAdd){

        this.saldo = this.saldo.add(saldoAdd);

        System.out.println("Deposito realizado com sucesso!\n");
        System.out.println(this.toString());

    }

    public void sacar(BigDecimal saldoSacar){

        this.saldo = this.saldo.subtract(saldoSacar);

        System.out.println("Saque realizado com sucesso!\n");
        System.out.println(this.toString());

    }

    public void transferir(ContaCorrente contaDestino, BigDecimal valorTransferir){

        this.saldo = this.saldo.subtract(valorTransferir);
        contaDestino.saldo = contaDestino.saldo.add(valorTransferir);

        System.out.println("Valor transferido com sucesso!\n");
        System.out.println(this.toString());

    }

    public void devolucao(ContaCorrente contaDevolver, BigDecimal valorDevolver){

        this.transferir(contaDevolver, valorDevolver);

    }

    @Override
    public String toString() {
        return "Conta: "+ numero +"\n" +
                "Saldo -> " + saldo;
    }
}
