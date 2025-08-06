import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Digite um número para o intervalo: ");
        a = scan.nextInt();
        System.out.println("Digite um número para o intervalo: ");
        b = scan.nextInt();

        System.out.println("Digite um número: ");
        c = scan.nextInt();

        System.out.println(c > a && b > c || c > b && a > c ? "Está dentro do intervalo":"Não está dentro do intervalo");



    }
}
