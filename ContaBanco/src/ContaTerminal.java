import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //Instancia o Scanner
        Scanner sc = new Scanner(System.in);
        //Declaração de Variaveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;
        //Usos da classe Scanner
        System.out.println("Insira o número da conta, por favor:");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o código da agência, por favor:");
        agencia = sc.nextLine();
        System.out.println("Insira seu nome, por favor:");
        nomeCliente = sc.nextLine();
        System.out.println("Insira o saldo disponível na conta, por favor:");
        saldo = sc.nextFloat();
        //Exibição dos resultados
        System.out.println("\n Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo +" já está disponível para saque!");

    }
}