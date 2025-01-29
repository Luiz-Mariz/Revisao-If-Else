package MediasNotas;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double nota2= sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        if ((media >= 5) && (media <7)){
            System.out.println("O aluno esta de recuperação");
        } else if (media >= 7) {
            System.out.println("O aluno foi aprovado");
        }
        else {
            System.out.println("O aluno foi reprovado");
        }
        sc.close();
    }

}
