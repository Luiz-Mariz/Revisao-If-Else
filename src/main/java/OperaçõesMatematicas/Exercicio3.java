package OperaçõesMatematicas;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        if ((numero1 % numero2 == 0) || (numero2 % numero1 == 0)){
            System.out.println("Os números são divisiveis");
        }
        else {
            System.out.println("Os números não são divisiveis");
        }
        sc.close();
    }

}
