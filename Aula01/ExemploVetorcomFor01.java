/**
 * ExemploVetorcomFor01
 */
import java.util.Scanner;
public class ExemploVetorcomFor01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nomes = new String[3];
        System.out.print(nomes.length);
        for(int i = 0;i < nomes.length; i = i + 1){
            System.out.print("Nome: ");
            nomes[i] = teclado.nextLine();
            
        }
        for(int i = 0;i < nomes.length; i = i + 1){
            System.out.print(nomes[i] + ",");
        }
    }
}