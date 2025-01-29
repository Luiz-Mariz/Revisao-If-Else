package Básicos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior numero inserido é igual " + numero1);
        }
        else {
            System.out.println("O maior numero inserido é igual " + numero2);
        }
        sc.close();

    }

}
