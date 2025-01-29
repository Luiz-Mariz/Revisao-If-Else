package CondiçõesComString;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();

        if (palavra.length() > 5){
            System.out.println("A palavra contem mais de 5 caracteres");
        }
        else {
            System.out.println("A palavra cotem 5 ou menos caracteres");
        }
        sc.close();
    }
}
