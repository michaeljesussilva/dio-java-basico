import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("DIGITE SEU NOME: ");
        String nome = scanner.next();

        System.out.println("DIGITE SEU SOBRENOME: ");
        String sobreNome = scanner.next();

        System.out.println("DIGITE SUA IDADE: ");
        int idade = scanner.nextInt();

        System.out.println("DIGITE SUA ALTURA: ");
        double altura = scanner.nextDouble();

        System.out.println(" ");

        System.out.println("Olá, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");

        }
        catch (InputMismatchException e){
            System.out.println("O campo idade e altura precisam ser numéricos!");
        }

    }
}
