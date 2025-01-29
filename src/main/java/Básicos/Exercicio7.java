package Básicos;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        double numero = sc.nextDouble();

        if (numero % 5 == 0){
            System.out.println("O numero é multiplo de 5");
        }
        else {
            System.out.println("O numero não é multiplo de 5");
        }
        sc.close();
    }

}
