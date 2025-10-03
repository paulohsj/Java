package primeirosexercicios;
import java.util.Scanner;


public class Desafio {
    public static void main(String[] args) {
        limparConsole();
        bancoDigital();
    }
    
    //Desafio: Criar um App com função de um Banco Digital simples

    /* Precisamos:
    -Iniciar os dados do cliente (nome, saldo, tipo de conta)
    -Criar um menu com opções (ver saldo, depositar, transferir, sair)
    -Implementar as funcionalidades do menu: 
        -Ver saldo: Mostrar o saldo atual do cliente
        -Depositar: Adicionar um valor ao saldo do cliente e mostrar o saldo atualizado
        -Transferir: Subtrair um valor do saldo do cliente e mostrar o saldo atualizado
        -Sair: Finalizar o programa
    -Tratar possíveis erros (ex: saldo insuficiente / Digitação inválida)
    -Finalizar o programa quando o usuário escolher sair
    -Limpar o console a cada ação (opcional que eu quis fazer)
      */
    
    public static void limparConsole() { //Não faz uma boa limpeza, tenho que pesquisar mais
        System.out.println("\033[H\033[2J"); 
        System.out.flush();
    }

    public static void retornoAoMenu() { //Pausa para o usuário ver o resultado antes de limpar o console
        
        System.out.println("\nPressione ENTER para voltar ao menu.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void bancoDigital() {
        int opcao; 
        Scanner leitor = new Scanner(System.in);

        //Dados fictícios do banco e cliente     
        System.out.println("******************************\n");
        System.out.println("Bem-vindo ao Banco Digital!");
        System.out.println("Nome do Cliente: Fulano de Tal");
        String tipoDeConta = "Conta Corrente";
        System.out.println("Tipo de Conta: " + tipoDeConta);
        Float saldoAtualDaConta = 1000.00f;
        System.out.println("Seu Saldo é de: R$ " + String.format("%.2f", saldoAtualDaConta));
        System.out.println("\n******************************");
        System.out.println("\nPressione ENTER para continuar."); //Pausa para o usuário ver os dados antes de limpar o console
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        //Menu de opções
        do {
        limparConsole();
        System.out.println("""
        Escolha uma das opções abaixo:\n
        1 - Ver Saldo
        2 - Depositar
        3 - Transferir
        4 - Sair 
        \n""");
        opcao = leitor.nextInt();

            switch (opcao) {
                case 1: 
                    limparConsole();
                    System.out.println("Seu saldo atual é de: R$ " + String.format("%.2f", saldoAtualDaConta));
                    retornoAoMenu();
                    limparConsole();
                    break;

                case 2:
                    limparConsole();
                    System.out.println("Qual valor você deseja depositar? ");
                    Float valorDeposito = leitor.nextFloat();
                    limparConsole();
                    System.out.println("Você Depositou: R$ " + String.format("%.2f", valorDeposito));
                    saldoAtualDaConta += valorDeposito;
                    System.out.println("Seu saldo atualizado é de: R$ " + String.format("%.2f", saldoAtualDaConta));
                    retornoAoMenu();
                    break;

                case 3: 
                    limparConsole();
                    System.out.println("Qual valor você deseja transferir? ");
                    Float valorTransferencia = leitor.nextFloat();
                    if (valorTransferencia > saldoAtualDaConta) {
                        limparConsole();
                        System.out.println("Saldo insuficiente para essa transferência. Seu saldo atual é de: R$ " + String.format("%.2f", saldoAtualDaConta));
                        retornoAoMenu();
                    } else {
                        limparConsole();
                        System.out.println("Você Transferiu: R$ " + String.format("%.2f", valorTransferencia));
                        saldoAtualDaConta -= valorTransferencia;
                        System.out.println("Seu saldo atualizado é de: R$ " + String.format("%.2f", saldoAtualDaConta));
                        retornoAoMenu();
                    }
                    break;

                case 4: 
                    limparConsole();
                    System.out.println("Obrigado por usar nosso Banco Digital. Até logo!");
                    break;

                default:
                    limparConsole();
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida."); 
                    retornoAoMenu();
                    break;
                }
            } while (opcao != 4);
        }
}