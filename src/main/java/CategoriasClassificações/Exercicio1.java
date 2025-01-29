package CategoriasClassificações;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 60){
            System.out.println("Você é da categoria idosa");
        }
        else if (idade >= 18 ){
            System.out.println("Voce é da categoria adulta");
        }
        else if (idade >= 12) {
            System.out.println("Você é da categoria adolecente");
        }
        else {
            System.out.println("Você é da categoria criança");
        }
        sc.close();
    }

}
