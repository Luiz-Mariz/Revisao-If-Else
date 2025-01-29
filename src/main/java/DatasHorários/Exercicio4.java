package DatasHorários;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe hora: ");
        double hora = sc.nextDouble();

        if (hora < 12){
            System.out.println("Manhã");
        }
        else if (hora > 18) {
            System.out.println("Noite");
        }
        else {
            System.out.println("Tarde");
        }
        sc.close();

    }

}
