import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua nota: ");
        double nota = scan.nextDouble();

        System.out.println(nota >= 60 ? "Aprovado": "Reprovado");
    }
}
