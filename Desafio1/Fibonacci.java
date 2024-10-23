package Desafio1;
import java.util.Scanner;

public class Fibonacci {

    public static boolean isFibonacci(int n) {
        // Detalhe: 0 e 1 são considerados números de Fibonacci
        if (n == 0 || n == 1) {
            return true;
        }
        //Inicializa as variáveis para calcular a sequência de Fibonacci
        int a = 0, b = 1, next = 0;
        
        while (next < n) {   
            next = a + b; // Calcula o próximo número da sequência
            a = b;
            b = next;
        }
        // Verifica se o último número calculado é igual ao número fornecido
        return next == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
        
        sc.close();
    }
}
