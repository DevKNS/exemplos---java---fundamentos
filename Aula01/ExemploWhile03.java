
import java.util.Scanner;
public class ExemploWhile03{
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
     int atual  = 0,  quantidadePositivos = 0, quantidadeNegativos = 0; 
   while (atual < 5){

   	System.out.print ("Número ");
   	int numero = Integer.parseInt(teclado.nextLine());
   	if (numero > 0){
   		quantidadePositivos = quantidadePositivos + 1;
   	}else if (numero < 0){
   		quantidadeNegativos = quantidadeNegativos + 1;
	}
   	

   	atual = atual + 1;
   
   }   

  }
	
}