import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numeroConta;
        int agencia;
        String cliente;
        double saldo = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scan.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scan.nextInt();

        scan.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        cliente = scan.nextLine();

        System.out.print("Por favor, digite o seu saldo: ");
        saldo = scan.nextDouble();

        Conta conta = new Conta(numeroConta, agencia, cliente, saldo);
        System.out.println("Olá " + conta.getNomeCliente() +
                           ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() +
                           ", conta " + conta.getNumero() + " e seu saldo R$ " + conta.getSaldo() + " já está disponível para saque");
    }
}
