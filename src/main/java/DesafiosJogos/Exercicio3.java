package DesafiosJogos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero ate acerta o numero secreto");
        double numeroUsuario = sc.nextDouble();

        double numeroSequetro = 102;

        if (numeroUsuario == numeroUsuario) {
            System.out.println("Parabens você acertou o numero secreto");
        } else{

            System.out.println("Tente novamente");
        }
        sc.close();
    }

}
