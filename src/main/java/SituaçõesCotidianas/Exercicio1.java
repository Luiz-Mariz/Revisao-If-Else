package SituaçõesCotidianas;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua placa: ");
        int placa = sc.nextInt();

        if (placa % 2 == 0){
            System.out.println("Você pode passar no pedagio");
        }
        else {
            System.out.println("Você não pode passa no pedagio");
        }
        sc.close();
    }

}
