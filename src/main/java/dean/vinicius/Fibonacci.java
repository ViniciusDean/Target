package dean.vinicius;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Informe um número ou digite qualquer letra para sair: ");
            input = scanner.nextLine();

            try {
                int numero = Integer.parseInt(input);

                if (pertenceFibonacci(numero)) {
                    System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
                } else {
                    System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
                }

            } catch (NumberFormatException e) {
                // Sai do loop se o input não for um número
                System.out.println("Saindo...");
                break;
            }
        }

        scanner.close();
    }

    public static boolean pertenceFibonacci(int numero) {
        int a = 0, b = 1, soma;

        if (numero == 0 || numero == 1) {
            return true;
        }

        while (b < numero) {
            soma = a + b;
            a = b;
            b = soma;
        }

        return b == numero;
    }
}
