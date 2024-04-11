import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        boolean controlador = true;

        String nome = "Luiz Francisco";
        String tipoConta = "Corrente";
        double saldo = 2500;

        do {
            System.out.println("====================");
            System.out.println("    Menu Inicial    ");
            System.out.println("====================");
            System.out.println("1) Consultar Valor;");
            System.out.println("2) Receber Valor;");
            System.out.println("3) Transferir valor;");
            System.out.println("4) Sair;");
            System.out.println("");
            System.out.println("Digite sua escolha: ");
            int escolha = leitura.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("");
                    System.out.println("O saldo atual da conta é: " + saldo );
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Qual valor você irá receber ?");
                    double receber = leitura.nextDouble();
                    saldo += receber;
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Quanto você irá transferir ?");
                    double transferir = leitura.nextDouble();
                    System.out.println("");

                    if(transferir > saldo){
                        System.out.println("Você não tem saldo o suficiente para concluir essa transferência.");
                    }
                    else{
                        System.out.println("");
                        System.out.println("Transferido o valor de: "+ transferir);
                        saldo -= transferir;
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema.");
                    controlador = false;
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        } while (controlador);
    }
}
