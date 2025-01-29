package SituaçõesCotidianas;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Informe seu peso: ");
        double peso = sc.nextDouble();

        if ((idade >= 18 && idade <= 65) && (peso >= 50)){
            System.out.println("Você esta apto para doar sangue");
        }
        else {
            System.out.println("Você não esta apto para doar sangue");
        }
        sc.close();
    }
}
