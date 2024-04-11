public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: "+ anoDeLancamento);

        boolean incluidoNoPlano = true;
        if(incluidoNoPlano){
            System.out.println("Esse filme está incluido no plano.");
        }
        else{
            System.out.println("Esse filme não está incluido no plano.");
        }
        double notaDoFilme = 8.1;
        double media = ((9.8 + 6.3 + 8.0) /3);
        System.out.println("Média: " + media);

        String sinopse;
        sinopse = "Filme de Aventura com galã dos anos 80";
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        //classificacao = media/2
        System.out.println(classificacao);
    }
}