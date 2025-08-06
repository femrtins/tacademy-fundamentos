import java.util.Scanner;

import static java.lang.System.in;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        double nota, media;
        double soma =0;
        for (int i = 0; i < 3; i++){
            System.out.println("Informe sua nota: ");
            nota= scan.nextDouble();
            soma+=nota;
        }
        media = soma / 3;
        System.out.println("Sua média é " + media);
        if (media < 3){
            System.out.println("D");
        }
        else if (media < 6){
            System.out.println("C");
        }
        else if (media < 8){
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }


    }
}
