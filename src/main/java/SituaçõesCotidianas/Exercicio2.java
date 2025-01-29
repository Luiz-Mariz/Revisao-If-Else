package SituaçõesCotidianas;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o codigo de acesso: ");
        int codigoUsuario = sc.nextInt();

        int codigo = 123;

        if (codigo == codigoUsuario){
            System.out.println("Codigo correto");
        }
        else {
            System.out.println("Tente novamente");
        }
        sc.close();
    }

}
