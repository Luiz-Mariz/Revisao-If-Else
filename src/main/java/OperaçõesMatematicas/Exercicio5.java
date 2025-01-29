package OperaçõesMatematicas;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        int raiz = (int) Math.sqrt(numero);

        if (raiz * raiz == numero) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " NÃO é um quadrado perfeito.");
        }

    }
}
