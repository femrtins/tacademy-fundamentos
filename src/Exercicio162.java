import java.util.Scanner;

import static java.lang.System.in;

public class Exercicio162 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);
        double a, b, c;
        System.out.println("Digite o coeficiente de x^2: ");
        a = scan.nextInt();
        if (a == 0) {
            System.out.println("O valor de a é 0, a equação não é de segundo grau");
            return;
        }

        System.out.println("Digite o coeficiente de x^1: ");
        b = scan.nextInt();
        System.out.println("Digite o coeficiente de x^0: ");
        c = scan.nextInt();

        // Calcular o delta
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("O delta é negativo, a equação não possui raízes reais");
            return;
        }

        // Calcular as raízes
        double x1 = (b - Math.sqrt(delta)) / 2 * a;
        double x2 = (b + Math.sqrt(delta)) / 2 * a;

        //Se o delta for 0
        if (delta == 0){
            System.out.println("A equação possui somente uma raiz");
            System.out.println("x = " + x1);
        }
        else {
            System.out.println("x' = " + x1);
            System.out.println("x'' = " + x2);
        }
    }
}
