import java.util.Scanner;

/**
 * ExemploFor02
 */

public class ExemploFor02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       
        for (int atual = 0; atual < 7; atual = atual     + 1){
            System.out.print ("Nome: ");
            String nome = teclado.nextLine();
        }
    }
}