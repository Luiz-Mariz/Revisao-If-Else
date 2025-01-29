package DatasHorários;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome de um mês do ano: ");
        String mes = sc.next();

        if (mes.equals("Janeiro") || mes.equals("Fevereiro") || mes.equals("Março") || mes.equals("Abril") || mes.equals("Maio") || mes.equals("Julho") || mes.equals("Junho") || mes.equals("Agosto") || mes.equals("Setembro") || mes.equals("Outubro") || mes.equals("Novembro") || mes.equals("Dezembro")){
            System.out.println("Mês e valido");
        }
        else {
            System.out.println("Mês invalido");
        }
        sc.close();

    }

}
