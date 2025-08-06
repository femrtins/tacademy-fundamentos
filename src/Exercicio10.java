import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os lados do triângulo:");
        String[] lados = scan.nextLine().split(" ");

        if (lados[0].equals(lados[1]) && lados[1].equals(lados[2])){
            System.out.println("Equilátero");
        } else if (lados[0].equals(lados[1]) || lados[1].equals(lados[2]) || lados[0].equals(lados[2])  ) {
            System.out.println("Isóceles");
        }
        else {
            System.out.println("Escaleno");
        }

    }
}
