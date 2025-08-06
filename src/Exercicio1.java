import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        if (n > 0){
            System.out.println("Positivo");
        }
        else if (n < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Zero");
        }
    }
}
