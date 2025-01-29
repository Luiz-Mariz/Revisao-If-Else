package Básicos;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um carctere: ");
        char vogal = sc.next().toLowerCase().charAt(0);

        if ("aeiou".contains(String.valueOf(vogal))){
            System.out.println("E uma vogal");
        }
        else {
            System.out.println("Não e uma vogal");
        }
    }
}
