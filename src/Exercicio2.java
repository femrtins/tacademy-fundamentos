import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        System.out.println(n % 2 == 0 ? "Par" : "Ímpar");
    }
}
