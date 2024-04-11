import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numAleatorio = new Random().nextInt(100);
        int contador = 0;
        int tentativa;

        while(true){
            System.out.println("Digite sua tentativa: ");
            tentativa = leitura.nextInt();
            contador ++;
            if (tentativa == numAleatorio){
                break;
            }
        }

        System.out.println("Parabéns você acertou!");
        System.out.println("Era o número: " + numAleatorio);
        System.out.println("Você tentou: " + contador +" vezes");
    }
}
