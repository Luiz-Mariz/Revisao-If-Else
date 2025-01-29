package SituaçõesCotidianas;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Convertor graus Celsius");
        System.out.println("Informe se você quer converter para graus Kelvin ou Fahrenheit (escreva o nome): ");
        String resposta = sc.next();

        System.out.println("Informe a temperatura: ");
        double temperatura = sc.nextDouble();
        double converter = 0;

        if (resposta.equals("Kelvin")){
            converter = temperatura + 273.15;
            System.out.println("Temperatura convertida para Kelvin: " + converter);
        } else if (resposta.equals("Fahrenheit")) {
            converter = (temperatura * 9/5) + 32;
            System.out.println("Temperatura convertida para Fahrenheit: " + converter);
        }
        else {
            System.out.println("Escolha inválida.");
        }
        sc.close();
    }

}
