import java.util.Scanner;

// Classe principal do programa
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("\nInforme o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("\nInforme o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("\nInforme o saldo da conta: ");
        Float saldo = scanner.nextFloat();

        ContaBancaria conta = new ContaBancaria(numero, agencia, nome, saldo);

        System.out.println(conta.apresentarMensagem());

        scanner.close();
    }

}
