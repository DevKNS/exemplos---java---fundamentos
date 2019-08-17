/**
 * Lista7Ex2
 */
public class Lista7Ex2 {

    public static void main(String[] args) {
        int total = 0; 
        for (int numero = 0; numero < 10; numero++){
            for (int multiplicador = 0; multiplicador < 10; multiplicador++){
                for(int segundoMultiplicador = 0; segundoMultiplicador < 10; segundoMultiplicador++){
                    int resultado = ((numero * multiplicador) * segundoMultiplicador);
                    total = total + resultado;
                    System.out.println(numero + "*" + multiplicador + "*" + segundoMultiplicador + "=" + resultado);
                    
                    

                }
            }
        }

             
             
             
        
        
        System.out.println("Total: " + total);
    }
}