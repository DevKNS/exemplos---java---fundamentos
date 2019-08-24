import java.util.Scanner;



public class ExemploWhile02{
	public static void main(String[] args) {
		int atual = 0;
		
		Scanner teclado = new Scanner(System.in);
		double total = 0;
		while (atual < 3){
			System.out.print ("modelo: ");
			String modelo = teclado.nextLine();
			
			System.out.print ("Preço: ");
			double preco = Double.parseDouble (teclado.nextLine());
            
            total = total + preco;
            atual = atual + 1;
    	}
	
           System.out.println("Total: " + total);
           
	} 
}