public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFIlme = 8.1;
        String tipoPlano = "Normal";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }
        else{
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        // || significa OU
        // $$ significa E
        // ! significa NOT
        if(incluidoNoPlano == true || tipoPlano.equals("Plus")){
            System.out.println("Filme liberado!");
        }
        else{
            System.out.println("Deve pagar a locação!");
        }
    }
}
