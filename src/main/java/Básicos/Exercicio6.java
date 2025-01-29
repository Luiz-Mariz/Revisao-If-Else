package Básicos;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0) {
            System.out.println(ano + " é bissexto");
        } else {
            System.out.println(ano + " não é bissexto");
        }
        sc.close();

    }

}
