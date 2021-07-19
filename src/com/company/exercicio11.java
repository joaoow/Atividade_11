package com.company;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int inteiro1;
        int inteiro2;
        int real;

        System.out.println("Digite o primeiro numero inteiro: ");
        inteiro1 = scan.nextInt();

        System.out.println("digite o segundo numero inteiro: ");
        inteiro2 = scan.nextInt();

        System.out.println("digite o numero real: ");
        real = scan.nextInt();

        System.out.println("a. o produto do dobro do primeiro com metade do segundo");
        System.out.println("resposta: " + inteiro1*2* inteiro2 /2);

        System.out.println("b. a soma do triplo do primeiro com o terceiro.");
        int results = inteiro1*3+real;
        System.out.println("resposta: "+ results);

        System.out.println("c. o terceiro elevado ao cubo.");
        int results2 = (int) Math.pow(real,3);
        System.out.println("A resposta é: "+results2);





    }
}
