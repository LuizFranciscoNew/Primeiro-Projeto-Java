import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número Inteiro: ");
        int num1 = leitura.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = leitura.nextInt();

        if (num1 == num2){
            System.out.println("Os números digitados são iguais.");
        }
        else{
            System.out.println("Os números digitados não são iguais.");
        }
    }
}
