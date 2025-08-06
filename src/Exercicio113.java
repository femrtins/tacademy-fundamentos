import java.util.Scanner;

import static java.lang.System.in;

public class Exercicio113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.print("Informe o salário: R$");
        double salario = scan.nextDouble();

        double aumento;
        int percentual;
        if (salario <= 280) {
            percentual = 20;
            aumento = salario * percentual/100;
        } else if (salario < 700) {
            percentual = 15;
            aumento = 56 + (salario - 280) * percentual/100;
        } else if (salario < 1500) {
            percentual = 10;
            aumento = 119 + (salario - 699.99) * percentual/100;
        }
        else {
            percentual = 5;
            aumento = 188.99 + salario * percentual/100;
        }

        double salarioFinal = aumento + salario;
        System.out.println("Salário antes do reajuste: R$" + salario);
        System.out.println("Percentual aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Salário após o aumento: " + salarioFinal);
    }
}

