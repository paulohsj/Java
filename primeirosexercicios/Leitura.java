package primeirosexercicios;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite seu filme favorito: ");
        String filme = leitor.nextLine();
        System.out.println("Qual o ano de lançamento do filme?");
        int ano = leitor.nextInt();
        System.out.println("Qual a nota do filme?");
        double nota = leitor.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println("Sua Avaliação foi: " + nota);

        double notaTotal = nota;
        
        for (int i = 0; i < 2; i++) {
        System.out.println("Pense em 2 notas que seus amigos deram para o filme: ");
        double notaAmigos = leitor.nextDouble();
        notaTotal += notaAmigos;
        }
        System.out.println("Sua nota e a de seus amigos para o filme '" +filme + "' Ficou com a média: " + notaTotal/3);
    }
    
}
