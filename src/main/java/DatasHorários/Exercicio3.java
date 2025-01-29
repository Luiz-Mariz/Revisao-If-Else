package DatasHorários;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o mês (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o dia do mês: ");
        int dia = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                System.out.print("Digite o ano: ");
                int ano = scanner.nextInt();
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) { // Ano bissexto
                    if (dia >= 1 && dia <= 29) {
                        System.out.println(dia + " de fevereiro é um dia válido.");
                    } else {
                        System.out.println(dia + " de fevereiro não é um dia válido.");
                    }
                } else { // Ano não bissexto
                    if (dia >= 1 && dia <= 28) {
                        System.out.println(dia + " de fevereiro é um dia válido.");
                    } else {
                        System.out.println(dia + " de fevereiro não é um dia válido.");
                    }
                }
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // Meses com 30 dias
                if (dia >= 1 && dia <= 30) {
                    System.out.println(dia + " é um dia válido.");
                } else {
                    System.out.println(dia + " não é um dia válido.");
                }
            }
            else {
                if (dia >= 1 && dia <= 31) {
                    System.out.println(dia + " é um dia válido.");
                } else {
                    System.out.println(dia + " não é um dia válido.");
                }
            }
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }
}
