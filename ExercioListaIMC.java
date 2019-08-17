/**
 * ExercioListaIMC
 */
import java.util.Scanner;
public class ExercioListaIMC {

    public static void main(String[] args) {
        Scanner teclado = new (System.in)
        System.out.println("Escreva seu nome: ");
        String nome = teclado.nextLine()
        System.out.println("Escreva seu peso: ");
        Double peso = Double.parseDouble(teclado.nextLine());
        System.out.println("Escreva sua altura");
        Double altura = Double.parseDouble(teclado.nextLine());
        Double calculoIMC = peso / (altura * altura)

        System.out.print("Esse é seu IMC: " + calculoIMC)
    
        //IMC CALCULADO
        if(calculoIMC <= 17){
            System.out.println("Muito abaixo do Texto");{
        }        }

    
    
    }    

}