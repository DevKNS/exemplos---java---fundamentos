import java.util.Scanner;

/**
 * Lista7Ex3
 */
public class Lista7Ex3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva um numero inteiro que represente o tamanho do seu quadrado: ");
        int tamanhoQuadrado = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < tamanhoQuadrado; i++) {
            for (int j = 0; j < tamanhoQuadrado; j++) {
                System.out.print("*   ");

            }
            System.out.println();    
        }
    }

}
