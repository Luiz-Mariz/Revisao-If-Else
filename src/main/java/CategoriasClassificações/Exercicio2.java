package CategoriasClassificações;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = sc.nextInt();

        if ((numero >= 1) && (numero <= 10)) {
            System.out.println("O numero pertence a faixa A");
        }
        else if ((numero >= 11) && (numero >= 20)) {
            System.out.println("O numero pertence a faixa B");
        }
        else if ((numero >= 21) && (numero <= 30)) {
            System.out.println("O numero pertence a faixa C");
        }
        else {
            System.out.println("O numero não pertence a nenhuma faixa");
        }
        sc.close();
    }

}
