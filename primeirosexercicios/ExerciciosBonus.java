package primeirosexercicios;
public class ExerciciosBonus {
    public static void main (String[] args) {
        exercicio ();
    }

    //Método para organizar os exercícios bônus

    public static void exercicio () {
    //Exercicio conversão de temperatura
        int temperaturaCelsius = 22;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + String.format("%.2f", temperaturaFahrenheit) + " °F");
        

    //Exercicio realizando médias
        double nota1 = 8.5;
        double nota2 = 7.3;
        double nota3 = 9.0;
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é: " + String.format("%.2f", media));

    //calculando preço/quantidade de produtos
        double produtoA = 19.99;
        double produtoB = 15.43;
        double produtoC = 6.50;
        int quantidadeA = 3;
        int quantidadeB = 2;
        int quantidadeC = 5;
        double total = (produtoA * quantidadeA) + (produtoB * quantidadeB) + (produtoC * quantidadeC);
        System.out.println("O valor total da compra é: R$ " + String.format("%.2f", total));
        
        //Exercicio ---
        

    }
}
