package OperaçõesMatematicas;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        double subtracao = numero1 - numero2;

        if (subtracao < 0){
            System.out.println("A diferença dos números é negativa");
        }
        else {
            System.out.println("A diferença dos números não é negativa");
        }
        sc.close();
    }

}
