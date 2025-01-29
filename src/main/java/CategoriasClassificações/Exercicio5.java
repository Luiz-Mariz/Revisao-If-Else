package CategoriasClassificações;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Insira a primeira parte (exemplo 12/8 ponha o 12): ");
        double temperatura = sc.nextDouble();

        if (temperatura >= 30){
            System.out.println("O dia esta quente");
        }
        else if (temperatura <= 18) {
            System.out.println("O dia esta frio");
        }
        else {
            System.out.println("O dia esta nornal");
        }
        sc.close();

    }

}
