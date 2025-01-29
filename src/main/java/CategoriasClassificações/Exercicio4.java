package CategoriasClassificações;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Medidor preção");
        System.out.println("Insira a primeira parte (exemplo 12/8 ponha o 12): ");
        double precao1 = sc.nextDouble();
        System.out.println("Insira a segunda parte (exemplo 12/8 ponha o 8): ");
        double precao2 = sc.nextDouble();

        double calculo = precao1 / precao2;

        if (calculo > 5){
            System.out.println("Sua preção esta alta");
        }
        else if (calculo <= 1.5) {
            System.out.println("Sua preção esta normal");
        }
        else {
            System.out.println("Sua preção esta moderada");
        }
        sc.close();

    }

}
