/**
 * CompararString
 */
import java.util.Scanner;
public class CompararString {
    Scanner teclado =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreva seu nome"); 
        String nome = teclado.nextLine();
        /*
        equals -> compara o texto porém diferencia Letra maiuscula de minuscula
        equalsIgnoreCase -> compara o texto ignorando Letra maiuscula de minuscula
        */ 
        if(nome.equals("Fracisco");
            System.out.println("igual");
            }else {
                System.out.println("Diferente");    
            }
        }        
    }    
}