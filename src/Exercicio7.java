import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = scan.nextInt();
        System.out.println(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0) ? "É bissexto": "Não é bissexto");
    }
}
