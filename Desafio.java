import java.util.Scanner;



public class Desafio {
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
      */
    
    
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Iniciando dados do cliente
        System.out.println("**************************");
        System.out.println("Bem-vindo ao Banco Digital");
        System.out.println("Nome do Cliente: Fulano de Tal");
        String tipoDeConta = "Conta Corrente";
        System.out.println("Tipo de Conta: " + tipoDeConta);
        double saldoDaConta = 1000.00;
        System.out.println("Seu Saldo é de: R$ " + String.format("%.2f", saldoDaConta));
        System.out.println("**************************");

        //Menu de opções
        System.out.println("Selecione uma das opções abaixo: ");
        System.out.println("""
        1 - Ver Saldo
        2 - Depositar
        3 - Transferir
        4 - Sair 
        """);
        int opcao = leitor.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.println("Seu saldo atual é de: R$ " + String.format("%.2f", saldoDaConta));
                break;
                case 2:
                    System.out.println("Qual valor você deseja depositar? ");
                    double valorDeposito = leitor.nextDouble();
                    System.out.println("Você Depositou: R$ " + String.format("%.2f", valorDeposito));
                    System.out.println("Seu saldo atualizado é de: R$ " + String.format("%.2f", saldoDaConta + valorDeposito));
                    break;
                case 3:
        
            }
        }
    }