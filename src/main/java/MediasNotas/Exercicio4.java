package MediasNotas;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota = sc.nextDouble();

        if (nota >= 7){
            System.out.println("O aluno foi aprovado");
        }
        if (nota >= 10)
            System.out.println("O aluno recebeu em uma diciplina nota maxima ");

        sc.close();
    }

}
