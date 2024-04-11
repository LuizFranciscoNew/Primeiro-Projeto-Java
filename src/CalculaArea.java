import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1) Calcular área de um quadrado;");
        System.out.println("2) Calcular área de um retângulo;");
        System.out.println("Digite sua escolha: ");
        int escolha = leitura.nextInt();

        if(escolha == 1){
            System.out.println("Digite um dos lados do quadrado: ");
            double lado = leitura.nextDouble();
            double area = lado * lado;
            System.out.println("A área do quadrado é: " + area );
        }
        else{
            System.out.println("Digite um dos lados do retângulo: ");
            double lado1 = leitura.nextDouble();
            System.out.println("Digite o outro lado do retângulo: ");
            double lado2 = leitura.nextDouble();
            double area = lado1 * lado2;
            System.out.println("A área do retângulo é: " + area );
        }
    }
}
