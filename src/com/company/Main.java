//Meu primeiro projeto em java
//Autor Diêgo Rodrigues
//instagram: @diego_rofe

package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta("Diego", 12345678); //criação do objeto conta

        conta.setNumeroConta(123);
        conta.setdeposito(1000);

        System.out.println("O saldo da conta é R$"+conta.getSaldo());
        System.out.println("O limite do cartão de crédito é R$"+ conta.getLimite());
    }
}
