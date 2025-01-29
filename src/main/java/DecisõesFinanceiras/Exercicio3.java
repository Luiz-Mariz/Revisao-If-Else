package DecisõesFinanceiras;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu salario: ");
        double salario = sc.nextDouble();

        if (salario >= 3000){
            System.out.println("Você pode financiar um lote: ");
        }
        else{
            System.out.println("Você não pode financiar um lote");
        }
        sc.close();
    }
}
