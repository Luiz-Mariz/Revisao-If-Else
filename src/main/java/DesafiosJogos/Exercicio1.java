package DesafiosJogos;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        if ((numero1 > 0) && (numero2 > 0)){
            System.out.println("Os dois numeros são positivos");
        }
        else if ((numero1 < 0) || (numero2 < 0)) {
            System.out.println("Os dois numeros são negativos");
        }
        sc.close();
    }

}
