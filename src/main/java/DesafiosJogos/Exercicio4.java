package DesafiosJogos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Insira o segundo número: ");
        double numero2 = sc.nextDouble();
        System.out.println("Insira o terçeiro número: ");
        double numero3 = sc.nextDouble();

        if ((numero1 > numero2) && (numero1 > numero3) && (numero2 > numero3)){
            System.out.println(numero1 + " " + numero2 + " " + numero3);
        } else if ((numero1 > numero2) && (numero1 > numero3) && (numero3 > numero2)) {
            System.out.println(numero1 + " " + " " + numero3 + " " + numero2);
        }
        else if ((numero2 > numero1) && (numero2 > numero3) && (numero1 > numero3)) {
            System.out.println(numero2 + " " +  + numero1 + " " + numero3);
        }
        else if ((numero2 > numero1) && (numero2 > numero3) && (numero3 > numero1)) {
            System.out.println(numero2 + " " +  + numero3 + " " + numero1);
        }
        else if ((numero3 > numero1) && (numero3 > numero3) && (numero1 > numero2)) {
            System.out.println(numero3 + " " + +numero1 + " " + numero2);
        }
        else {
            System.out.println(numero3 + " " +  + numero2 + " " + numero1);
        }


        sc.close();
    }

}
