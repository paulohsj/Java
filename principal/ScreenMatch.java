package principal;
public class ScreenMatch {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nomeDoFilme = "Top Gun: Maverick";
        meuFilme.anoDeLançamento = 2022;
        meuFilme.duracaoEmMinutos = 130;

        meuFilme.exibeFichaTecnica();
    }
}
