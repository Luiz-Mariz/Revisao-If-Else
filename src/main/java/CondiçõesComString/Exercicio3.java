package CondiçõesComString;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = sc.next();

        if (nome.startsWith("A")) {
            System.out.println("Seu nome começa com A");
        }
        else {
            System.out.println("Seu nome não começa com A");
        }
    }
}
