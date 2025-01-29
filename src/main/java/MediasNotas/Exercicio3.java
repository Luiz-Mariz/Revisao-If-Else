package MediasNotas;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Insira a terçeira nota: ");
        double nota3 = sc.nextDouble();

        double maior = 0;
        double menor = 0;

        if ((nota1 > nota2) && (nota1 > nota3)){
            maior = nota1;
            System.out.println("Maior nota: " + nota1);

        } else if ((nota3 > nota1) && (nota2 > nota3)) {
            maior = nota2;
            System.out.println("Maior nota: " + nota2);
        }
        else {
            maior = nota3;
            System.out.println("Maior nota: " + nota3);
        }


        if ((nota1 < nota2) && (nota1 < nota3)){
            menor = nota1;
            System.out.println("Menor nota: " + nota1);

        } else if ((nota3 < nota1) && (nota2 < nota3)) {
            menor = nota2;
            System.out.println("Menor nota: " + nota2);

        }
        else {
            menor = nota3;
            System.out.println("Menor nota: " + nota3);

        }
        sc.close();
    }

}
