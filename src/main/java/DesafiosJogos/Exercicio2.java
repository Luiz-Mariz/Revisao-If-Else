package DesafiosJogos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        double dobro = numero2 * 2;

        if (numero1 > dobro){
            System.out.println("O primeiro numero e maior que o dobro do segundo");
        }
        sc.close();
    }

}
