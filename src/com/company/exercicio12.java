package com.company;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        float Altura;
        System.out.println("qual sua altura? ");
        Altura = scan.nextFloat();

        double Peso = (72.7*Altura)-58;
        System.out.println("Seu peso é: "+Peso);


    }
}
