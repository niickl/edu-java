import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de Conta Terminal!");
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumeroConta() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");
    }
}