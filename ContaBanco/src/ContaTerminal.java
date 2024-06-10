import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

       int numero;
       String agencia;
       String nomeCliente;
       float saldo = 1050.20f;

       
        System.out.println("Digite seu nome:");
        nomeCliente = scanner.nextLine();

         System.out.println("Por favor digite o número da Agência!");
         agencia = scanner.nextLine();

         System.err.println("Digite o número da sua conta: ");
         numero = scanner.nextInt();

         
         System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco,sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja está disponível para o saque");
    }
}
