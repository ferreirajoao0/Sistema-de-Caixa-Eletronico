package sistemacaixaeletronico;
import java.util.Scanner;

public class InteracaoSistema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Titular: ");
        String nomeTitular = sc.nextLine();

        System.out.println("Nome cadastrado: " + nomeTitular);

        ContaBancaria conta = new ContaBancaria(nomeTitular, 1001);
        System.out.println("Conta Criada com sucesso para " + conta.getTitular() + "!");

        int opcao = -1;
        while(opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Opção Consultar Saldo selecionada.");
                    System.out.printf("Saldo atual: R$ %.2f%n" , conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Opção Depositar selecionada.");
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = sc.nextDouble();

                    if(conta.depositar(valorDeposito)) {
                        System.out.println("Depósito realidado com sucesso!");
                    }else{
                        System.out.println("Erro: O valor do depósito deve ser maior que zero.");
                    }
                    break;

                case 3:
                    System.out.println("Opção Sacar selecionada.");
                    System.out.println("Digite o valor para saque: R$ ");
                    double valorSaque = sc.nextDouble();

                    if(conta.sacar(valorSaque)) {
                        System.out.println("Saque realizaddo com sucesso! Retire seu dinheiro.");
                    }else{
                        System.out.println("Erro: Valor inválido ou saldo insuficiente.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema ... Até breve!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}
