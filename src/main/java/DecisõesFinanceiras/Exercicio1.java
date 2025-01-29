package DecisõesFinanceiras;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Informe o valor para saque: ");
        double saque = sc.nextDouble();

        double calculo = saldo - saque;

        if (calculo < 0){
            System.out.println("Você não tem saldo disponivel para esse saque");
        }
        else {
            System.out.println("Você tem sque disponivel para esse saque");
        }
        sc.close();
    }

}
