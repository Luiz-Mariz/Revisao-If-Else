package DecisõesFinanceiras;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe valor de compra: ");
        double valorCompra = sc.nextDouble();
        double desconto = 0;


        if (valorCompra > 500 ){
            desconto = (valorCompra * 10) / 100;
            valorCompra = valorCompra - desconto;
            System.out.println("O valor da compra final é " + valorCompra);
        }
        else System.out.println("O valor da compra final é " + valorCompra);

        sc.close();
    }

}
