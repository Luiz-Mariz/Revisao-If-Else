package Básicos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        double numero = sc.nextDouble();

        if ((numero > 100) && (numero > 200)){
            System.out.println("número está dentro do intervalo de 100 a 200");
        }
        else {
            System.out.println("número está fora do intervalo de 100 a 200");
        }
        sc.close();
    }


}
