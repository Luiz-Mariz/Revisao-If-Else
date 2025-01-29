package DecisõesFinanceiras;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu salario: ");
        double salario = sc.nextDouble();
        System.out.println("Informe o valor do protudo");

        double calculo = (salario * 10) / 100;

        if (salario > calculo){
            System.out.println("Você pode parcelar o produto");
        }
        else {
            System.out.println("Você não pode parcelar o produto");
        }
        sc.close();
    }

}
