import java.util.Scanner;

import static java.lang.System.in;

public class Exercicio112 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.print("Informe o salário: R$");
        double salario = scan.nextDouble();

        int percentual;
        if (salario <= 280) {
            percentual = 20;
        } else if (salario < 700) {
            percentual = 15;
        } else if (salario < 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }
        double aumento = salario * percentual / 100;
        double salarioFinal = aumento + salario;

        System.out.println("Salário antes do reajuste: R$" + salario);
        System.out.println("Percentual aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Salário após o aumento: " + salarioFinal);
    }
}
