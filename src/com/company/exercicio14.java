package com.company;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de kilos: ");
        double kilos = scan.nextDouble();
        double ideal = 50;

        if (kilos > 50) {
            double ex = kilos - ideal;
            System.out.println("o excedente de peso é: " + ex);
            double multa = ex * 4;
            System.out.println("pagará uma multa de: " + multa);
        }else{
                System.out.println("peso ideal correto, não pagará multa");

            }


        }
    }

