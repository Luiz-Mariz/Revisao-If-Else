package OperaçõesMatematicas;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();
        System.out.println("Digite o terçeiro número: ");
        double numero3 = sc.nextDouble();

        if ((numero1 + numero2) > numero3){
            System.out.println("Os numeros podem formar um triangulo ");
        }
        else if ((numero1 + numero3) > numero3){
            System.out.println("Os numeros podem formar um triangulo");
        } else if ((numero2 + numero3) > numero1) {
            System.out.println("Os numeros podem formar um triangulo");
        } else if ((numero1 == numero2) && (numero1 == numero3)) {
            System.out.println("Os numeros podem formar um triangulo");
        } else {
            System.out.println("Os numeros não podem formar um triangulo");
        }
        sc.close();

    }

}
