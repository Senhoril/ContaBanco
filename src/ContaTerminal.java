import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicita o nome do cliente
        System.out.println("Qual o seu nome?");
        nomeCliente = scanner.nextLine(); // Lê toda a linha

        // Solicita o número da conta
        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();

        // Limpa o buffer do scanner antes de ler a próxima linha
        scanner.nextLine();

        // Solicita a agência
        System.out.println("Digite a agência:");
        agencia = scanner.nextLine();

        // Solicita o saldo
        System.out.println("Digite o saldo:");
        saldo = scanner.nextDouble();

        // Exibe os dados inseridos
        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo
        ));
        System.out.println("este é um teste para o github!");
        // Fecha o Scanner
        scanner.close();
    }
}