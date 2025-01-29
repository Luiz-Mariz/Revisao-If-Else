package DecisõesFinanceiras;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe valor da compra: ");
        double compra = sc.nextDouble();

        double valorMinimo = 100;

        if (compra >= valorMinimo){
            System.out.println("Você pode ganhar brinde");
        }
        else {
            System.out.println("Você não pode ganhar o brinde");
        }
        sc.close();
    }

}
