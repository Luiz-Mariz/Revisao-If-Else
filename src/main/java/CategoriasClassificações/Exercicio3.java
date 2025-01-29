package CategoriasClassificações;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua altura em centimetros: ");
        double altura = sc.nextDouble();

        if (altura >= 190){
            System.out.println("Você e alto");
        }
        else if (altura >= 170) {
            System.out.println("Você tem altura mediana");

        }
        else {
            System.out.println("Você e baixo");
        }

    }

}
