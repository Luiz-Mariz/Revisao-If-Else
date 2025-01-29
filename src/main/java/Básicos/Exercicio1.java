package Básicos;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = sc.nextInt();

        if (numero == 0){
            System.out.println("O número e igual a zero");
        } else if (numero > 0) {
            System.out.println("O número e positivo");
        }
        else {
            System.out.println("O número e negativo");
        }
        sc.close();

    }

}
