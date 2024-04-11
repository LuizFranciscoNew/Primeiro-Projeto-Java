import java.util.Scanner;

public class Parímpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = leitura.nextInt();

        if(num % 2 == 0){
            System.out.println("O numero é Par.");
        }
        else{
            System.out.println("O número é Ímpar.");
        }
    }
}
