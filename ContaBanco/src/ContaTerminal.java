import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("--------BEM-VINDO--------\n\t   AO\n--------BANCO-DIO--------\n");

        System.out.println("Por favor insira os seguintes dados.\nAGENCIA:");
        int agencia = scanner.nextInt();
        System.out.println("CONTA:");
        int conta = scanner.nextInt();
        System.out.println("NOME COMPLETO:");
        String nome = scanner.nextLine();
        System.out.println("SALDO:");
        double saldo = Double.parseDouble(scanner.next());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque.\n",  nome, agencia, conta, saldo);


    }
}
