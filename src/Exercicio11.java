import java.util.Scanner;

import static java.lang.System.in;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println(idade >= 65 ? "Pode se aposentar" : "Não pode se aposentar");
    }
}
