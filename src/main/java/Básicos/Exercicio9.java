package Básicos;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        double numero = sc.nextDouble();

        if (numero > 10 && numero > 50){
            System.out.println("O número está dentro do intervalo de 10 a 50");
        }
        else {
            System.out.println("O número não esta dentro do intervalo de 10 a 50");
        }
        sc.close();
    }



}
