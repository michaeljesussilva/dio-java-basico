import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o numero da sua CONTA: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor digite o numero da sua AGENCIA: ");
        String agencia = scanner.next();

        System.out.println("DIGITE SEU NOME: ");
        String nomeCliente = scanner.next();

        double saldo = 237.48;

        System.out.println(" ");

        System.out.println("Olá! " + nomeCliente + " Obrigado por criar uma conta em nosso BANCO. "); 
        System.out.println("Sua AGÊNCIA é: " + agencia + ", CONTA: " + numeroConta);
        System.out.println("E o seu SALDO de: "+ "R$"+ saldo + " já está disponível para SAQUE!");

    }
}
