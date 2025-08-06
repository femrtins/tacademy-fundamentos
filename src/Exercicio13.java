import java.util.Scanner;

import static java.lang.System.in;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.println("Digite um número");
        int n = scan.nextInt();

        boolean primo = true;
        for (int i = 2 ; i < n; i++){
            if (n % i == 0){
                primo = false;
                break;
            }
        }
        System.out.println("O número " + (primo ? "" : "não ") + "é primo.");


    }
}
