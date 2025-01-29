package CondiçõesComString;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a palavra sim ou não: ");
        String palavra = sc.next();

        if (palavra.contains("sim")  || palavra.contains("Sim")){
            System.out.println("A palavra recebida foi sim");
        }

        if (palavra.contains("não") || palavra.contains("Não")){
            System.out.println("A palavra recebida foi não");
        }
        sc.close();
    }

}
