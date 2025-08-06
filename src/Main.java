import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu turno? (M, V, N)");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("M")){
            System.out.println("Bom dia!");
        }
        else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!");
        }
        else if (turno.equalsIgnoreCase("N")){
            System.out.println("Boa noite!");
        }
        else {
            System.out.println("Entrada inválida");
        }
    }
}