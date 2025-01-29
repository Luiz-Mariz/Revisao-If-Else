package DesafiosJogos;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Insira um número inteiro de 1 a 10, e tente acerta o numero sorteado");
        int numeroUsuario = sc.nextInt();

        int sorteio = random.nextInt(10) ;

        if (sorteio == numeroUsuario){
            System.out.println("Parabens você acertou o numero");
        }
        else {
            System.out.println("Tente novamente");
        }
        System.out.println("O numero correto era " + sorteio);
        sc.close();
    }

}
