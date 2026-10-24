import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual número ? ");
        int numero = scanner.nextInt();

        //multiplyLoop(numero);

        //less(numero);

        //caixa();

        //potencia(2, 3);

        //fatorial(4);


    }

    private static void multiplyLoop(int numero) {
        for (int i = 1; i <= numero; i++) {
            int mult = i * numero;
            String multiply = (i + " * " + numero + " = " + mult);
            System.out.println(multiply);
        }
    }

    public static void less(int numero) {

        Scanner scanner = new Scanner(System.in);


        int guess;

        do {
            System.out.println("Digite um número: ");
            guess = scanner.nextInt();

            if (guess < numero) {
                System.out.println("É menor");
            } else if (guess > numero) {
                System.out.println("É maior");
            }

        } while (guess != numero);

        System.out.println("Acertou!");
    }

    public static void caixa() {
        Scanner scanner = new Scanner(System.in);

        Scanner scannerTexto = new Scanner(System.in);

        int menu;
        String continuar;

        System.out.println("Qual o depósito inicial da conta?");
        double inicial = scanner.nextDouble();
        double saldo = inicial;

        do {
            System.out.println("\n--- MENU CAIXA ELETRÔNICO ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Valor do depósito: ");
                    double depo = scanner.nextDouble();
                    saldo += depo;
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 3:
                    System.out.println("Valor do saque? ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque autorizado. Novo saldo: " + saldo);
                    } else {
                        System.out.println("Saque não autorizado. Saldo insuficiente.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }


            System.out.print("Deseja continuar? (S/N): ");
            continuar = scannerTexto.nextLine();


        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Operação encerrada. Obrigado por utilizar nosso caixa eletrônico!");
    }
    public static void potencia(int base, int expo){
        int parcial = 1;
        for(int i = 1; i <= expo; i++){
            parcial = parcial * base;
        }
        System.out.println(base + " elevado a " + expo + " é igual a: " + parcial);
    }

    public static void fatorial(int numero){
        int parcial = numero;
        for(int i = numero -1; i < numero && i > 0; i--){
            parcial = parcial * i;

        }
        System.out.println("Fatorial de " + numero + " é igual a: " + parcial);
    }
}


