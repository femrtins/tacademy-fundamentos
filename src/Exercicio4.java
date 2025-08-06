import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        System.out.println(n % 3 == 0 && n % 5 == 0 ? "É divisível": "Não é divisível");
    }
}
