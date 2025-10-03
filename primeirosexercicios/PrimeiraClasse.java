package primeirosexercicios;
public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLançamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLançamento);
        boolean  inclusoNoPlano = true;
        double mediaDoFilme = (9.8 + 6.3 + 7.9) / 3;
        //Média calculada com base em 3 avaliações
        System.out.println("Média dos filmes: " + mediaDoFilme);
        String sinopseDoFilme = ("""
            Após mais de trinta anos de serviço como um dos principais aviadores da Marinha,
            Pete "Maverick" Mitchell (Tom Cruise) está onde sempre pertenceu,
            desafiando os limites como um piloto de testes corajoso e destemido.
            Agora, ele é chamado para treinar um grupo de graduados da elite da escola de voo 
            para uma missão especial que nenhum piloto vivo jamais viu. 
            Enfrentando um futuro incerto e confrontando o passado do qual ele fugiu, 
            Maverick se vê mentorando o filho falecido de seu antigo amigo, o falecido 
            tenente Nick Bradshaw, também conhecido como "Goose" (Anthony Edwards).
            """);
        //Teste de """ para string longa """
        System.out.println(sinopseDoFilme);

        int classificacao = (int) (mediaDoFilme /2);
        System.out.println("Classificação: " + classificacao + " estrelas");

        

    }
}
