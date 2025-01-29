package OperaçõesMatematicas;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;

        if (soma > 100){
            System.out.println("A soma dos números é maior que 100");
        }
        else {
            System.out.println("A soma dos números é menor ou igual a 100");
        }
        sc.close();
    }
}
