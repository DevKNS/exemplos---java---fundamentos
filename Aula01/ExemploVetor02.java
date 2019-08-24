import java.util.Scanner;

/**
 * ExemploVetor02
 */
public class ExemploVetor02 {

    public static void main(String[] args) {
        String[] nomes = new String[3];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome ");
        nomes[0] = teclado.nextLine(); 
        
        System.out.println("Nome ");
        nomes[1]= teclado.nextLine();
        System.out.println();
        nomes[2] = teclado.nextLine();
        System.out.println("Nomes " + nomes[0] + nomes[1] + " " + nomes[2]);
        
    }
}