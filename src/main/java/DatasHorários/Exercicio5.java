package DatasHorários;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o inicio do perildo: ");
        int perildoI = sc.nextInt();
        System.out.println("Informe o fim do perildo: ");
        int perildoF = sc.nextInt();
        System.out.println("Informe a data");
        int data = sc.nextInt();

        if ((data > perildoI) && (data < perildoF)){
            System.out.println("A data esta dentro de perildo");
        }
        else {
            System.out.println("A data não esta dentro do perildo");
        }
        sc.close();
    }

}
