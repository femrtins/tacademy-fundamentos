import java.util.Scanner;

import static java.lang.System.in;

public class Exercicio122 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.print("Digite o valor da sua hora: R$");
        double valorHora = scan.nextDouble();
        System.out.print("Digite suas horas trabalhadas: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;

        // Desconto do IR
        int pIr;
        if (salarioBruto <= 900)
            pIr = 0;
        else if (salarioBruto <= 1500) {
            pIr = 5;
        } else if (salarioBruto <= 2500) {
            pIr = 10;
        } else {
            pIr = 20;
        }
        double ir = pIr * salarioBruto / 100;

        // Desconto do INSS
        double inss = 0.1 * salarioBruto;
        // FGTS
        double fgts = salarioBruto * 0.11;
        //Salário Líquido
        double salarioLiquido = salarioBruto - ir - inss;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("(-) IR (" + pIr+ "%): R$" + ir);
        System.out.println("(-) INSS (10%): R$" + inss);
        System.out.println("FGTS (11%): R$" + fgts);
        System.out.println("Total de descontos: R$" + (ir + inss));
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
