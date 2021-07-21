package com.company;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int Genero;

        System.out.println("Digite seu sexo: 1 para homen e 2 para mulher: ");
        Genero = scan.nextInt();
        if (Genero == 1){
            double altura;
            double formula;
            System.out.println("Digite sua altura: ");
            altura = scan.nextDouble();
            formula = (72.7*altura) -58;
            System.out.println("Seu peso é: "+formula);


        }else if (Genero == 2){
            double altura2;
            double formula2;
            System.out.println("Digite sua altura: ");
            altura2 = scan.nextDouble();
            formula2 = (62.1*altura2) -44.7;
            System.out.println("Seu peso é: "+formula2);



        }
    }


}
