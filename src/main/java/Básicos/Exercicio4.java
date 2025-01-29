package Básicos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();
        int calculoIdade = 16 - idade;

        if (idade >= 16){
            System.out.println("Parabens você já pode votar");
        }
        else {
            System.out.println("Ainda falta " + calculoIdade + "para você votar ");
        }
        sc.close();

    }


}
