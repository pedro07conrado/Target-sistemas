package Desafio2;

import java.util.Scanner;

public class StringCounter {
    public static void main(String[] args) { 
    // Cria um objeto Scanner para ler a entrada do usuário
    Scanner sc = new Scanner(System.in); 

    System.out.print("Digite uma string: "); 
    // Lê a string digitada pelo usuário e armazena na variável input
    String input = sc.nextLine(); 

    int count = 0; // Inicializa uma variável para contar o número de letras 'a'

    // Loop para percorrer cada caractere da string
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i); // Extrai o caractere na posição 'i' da string e armazena em ch

      // Verifica se o caractere é 'a' minusculo ou maisculo 
      if (ch == 'a' || ch == 'A') {
        count++; // Incrementa o contador se for 'a'
      }
    }

    System.out.println("A letra 'a' aparece " + count + " vezes na string."); // Imprime o resultado da contagem

    sc.close(); // Fecha o Scanner para liberar recursos
  }
}
