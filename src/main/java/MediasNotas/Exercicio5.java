package MediasNotas;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota da segunda diciplina: ");
        double diciplina1 = sc.nextDouble();
        System.out.println("Insira a nota da segunda diciplina");
        double diciplina2 = sc.nextDouble();


        if(diciplina1 >= 7){
            System.out.println("O aluno foi aprovado na primeira diciplina");
        }
        else {
            System.out.println("O aluno foi reprovado na primeira diciplina");
        }


        if(diciplina2>= 7){
            System.out.println("O aluno foi aprovado na segunda diciplina");
        }
        else {
            System.out.println("O aluno foi reprovado na segunda diciplina");
        }

        sc.close();
    }

}
