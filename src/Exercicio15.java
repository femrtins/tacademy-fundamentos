import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.println("Digite uma palavra");
        String string = scan.nextLine();
        String palavra = string.replaceAll("\s+", "").toLowerCase(Locale.ROOT);

        char[] listaLetras = palavra.toCharArray();
        int tamanho = palavra.length() - 1;
        boolean palindromo = true;

        for (int i = 0; i < tamanho; i++) {
            if (listaLetras[i] != listaLetras[tamanho - i]) {
                palindromo = false;
                break;
            }
        }
        System.out.println("A string '" + string +  (palindromo ? "'" : "' não ") + " é um palíndromo.");
    }

}
