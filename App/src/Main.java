
import java.util.Scanner;

public class Main extends ContaTerminal {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de Conta Terminal!");
        System.out.println("Digite o número da conta: ");
        int numeroConta = Scanner.nextInt();

        Scanner.nextLine();

        System.out.print("Digite a agência: ");
        String agencia = Scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = Scanner.nextLine();
        
        System.out.println("Digite o saldo: ");
        double saldo = Scanner.nextDouble();
        Scanner.close();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");


    }
}