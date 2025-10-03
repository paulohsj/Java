package principal;

public class Filme {
    String nomeDoFilme;
    int anoDeLançamento;
    boolean inclusoNoPlano;
    double avaliação;
    int totalDeAvaliações;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nomeDoFilme);
        System.out.println("Ano de lançamento: " + anoDeLançamento);
    }

}
