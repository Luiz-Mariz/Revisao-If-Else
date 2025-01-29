package CondiçõesComString;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String senha = "1234";
        System.out.println("Digite a senha: ");
        String senhaVeri = sc.next();


        if (senhaVeri.equals(senha)){
            System.out.println("Parabens você acertou a senha");
        }
        else {
            System.out.println("Você errou a senha");
        }
        sc.close();
    }

}
