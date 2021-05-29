package com.company;

public class Conta {

    private String nome;
    private int cpf;
    private int numeroConta;
    private double saldo;
    private double limite;

    //Contrutor da Classe Conta
    Conta(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
        System.out.println("Criando um novo contrutor");
        System.out.println("Seja bem vindo "+ this.nome);
    }

    //Cadastra o numero da conta
    public void setNumeroConta(int numeroConta) {
        //Não aceita número negativo
        if(numeroConta >0) {
            this.numeroConta = numeroConta;
        } else{
            System.out.println("Número inválido");
        }
    }

    public void setdeposito(double deposito) {
        //Não aceita número negativo
        if (deposito > 0) {
            this.saldo += deposito;
        } else {
            System.out.println("Valor inválido");
        }
    }


    public void setsaque(double saque) {
        //Não aceita número negativo e saque superior ao saldo da conta
        if (saque > 0 && saque<=this.saldo) {
            this.saldo -= saque;
        } else {
            System.out.println("Saque não permitido");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Limite do cartão de crédito
    public double getLimite() {
        // O limite corresponde a 80% do valor do saldo em conta
        this.limite = this.saldo*0.8;

        return limite;
    }
}
