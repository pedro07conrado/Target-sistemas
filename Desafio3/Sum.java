package Desafio3;

public class Sum {
    public static void main(String[] args) {
    // Limite do loop
        int INDICE = 12;  
    // Acumulador para a soma    
        int SOMA = 0;     
   
        // Variável de controle do loop
        int K = 1;        
        // Loop que soma os números de 1 ate INDICE-1
        while (K < INDICE) {
            K = K + 1; // Incrementa K em 1 a cada iteração
            SOMA = SOMA + K; // Acumula o valor atual de K na variável SOMA
        }

        System.out.println(SOMA);
    }
}
