package DatasHorários;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe hora: ");
        double hora = sc.nextDouble();

        if (hora <= 24){
            System.out.println("Horario valido");
        }
        else {
            System.out.println("Horario invalido");
        }
        sc.close();
    }

}
