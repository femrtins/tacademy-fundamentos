import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade < 30){
            System.out.println("Jovem");
        } else if (idade >= 65) {
            System.out.println("Não jovem");
        }
        else{
            System.out.println("?");
        }
    }
}
