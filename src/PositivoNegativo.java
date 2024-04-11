import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leitura.nextInt();

        if(numero > 0){
            System.out.println("O número digitado é POSITIVO!");
        }
        else{
            System.out.println("O número digitado é NEGATIVO!");
        }
    }
}
