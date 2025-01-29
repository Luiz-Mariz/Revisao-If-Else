package CondiçõesComString;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Digite uma palavra: ");
        String palavra1 = sc.next();
        System.out.println("Digite outra palavra: ");
        String palavra2 = sc.next();

        if (palavra1.equals(palavra2)){
            System.out.println("As palavras são iguais");
        }
        else {
            System.out.println("As palavras são diferentes");
        }
        sc.close();
    }

}
