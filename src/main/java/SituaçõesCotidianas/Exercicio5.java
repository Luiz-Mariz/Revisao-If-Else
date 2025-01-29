package SituaçõesCotidianas;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String usuario = "Usuario1";
        String senha = "123456";

        System.out.println("Insira seu usuario: ");
        String vericacaoUsuario = sc.nextLine();

        System.out.println("Insira sua senha: ");
        String vericacaoSenha = sc.nextLine();

        if ((vericacaoUsuario.equals(usuario)) && (vericacaoSenha.equals(senha))) {
            System.out.println("Parabens você acertou");
        } else {
            System.out.println("Nome de usuário ou senha incorretos");
        }


    }

}
