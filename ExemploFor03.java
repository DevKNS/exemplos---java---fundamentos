import java.util.Scanner;

/**
 * ExemploFor03
 */
public class ExemploFor03 {

    public static void main(String[] args) {
        double total = 0; 
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 3;i= i + 1){
            
            System.out.print ("Pedido: " );
            String nome = teclado.nextLine();
            
            System.out.println("QUantidade: ");
            int quantidade = Integer.parseInt (teclado.nextLine());
           
            System.out.println("Preço unitário ");
            double precoUnitario  = Double.parseDouble (teclado.nextLine());
            double precoPedido = quantidade * precoUnitario;
            total = (total + precoPedido);
            System.out.println ("Seu pedido foi: " + nome );
            System.out.println ("A quantidade foi: " + quantidade);
            System.out.println("E o valor total foi " + total);
            
    
        

        }

    }
}