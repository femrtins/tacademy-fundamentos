import java.util.Scanner;

import static java.lang.System.in;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int a,b,c;
        System.out.println("Digite um número: ");
        a = scan.nextInt();
        System.out.println("Digite um número: ");
        b = scan.nextInt();
        System.out.println("Digite um número: ");
        c = scan.nextInt();

        int maior;
        if (a > b && a > c){
            maior = a;
        }
        else if (b > c){
            maior = b;
        }
        else{
            maior = c;
        }
        System.out.println("O maior número é " + maior);
    }
}
