import java.util.Scanner;

/**
 * Lista6Ex3
 */
public class Lista6Ex3 {

    public static void main(String[] args) {
        // var
        int somaMaiorQuinze = 0, somaMenorZero = 0, somaNumeroPar = 0, somaNumeroParPositivo = 0, somaNumeroImparNegativo = 0,
                somaNumeroZero = 0;

        int numeroComparado = 0;
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        while (numero <= 15) {
            System.out.println("Digite um número");
            numeroComparado = Integer.parseInt(teclado.nextLine());
            if (numeroComparado > 15) {
                somaMaiorQuinze = somaMaiorQuinze + 1;
            }

            if (numeroComparado < 0) {
                somaMenorZero = somaMenorZero + 1;
            }

            if (numeroComparado % 2 == 0) {
                somaNumeroPar = somaNumeroPar + 1;
            }

            if ((numeroComparado % 2 == 0) && numeroComparado > 0) {
                somaNumeroParPositivo = somaNumeroParPositivo + 1;
            }

            if ((numeroComparado % 2 == 1) && numeroComparado < 0) {
                somaNumeroImparNegativo = somaNumeroImparNegativo + 1;
            }

            if (numeroComparado < 0) {
                somaNumeroZero = somaNumeroZero + 1;

            }
            numero = numero + 1;  
        }
        System.out.println(" Quantidade de números superiores a 15: " + somaMaiorQuinze);
        
        System.out.println(" Quantidade de números inferiores a 0: " + somaMenorZero);
        
        System.out.println(" Quantidade de números pares: " + somaNumeroPar);
        
        System.out.println(" Quantidade de números pares e positivos: " + somaNumeroParPositivo);
       
        System.out.println(" Quantidade de números ímpares: " + somaNumeroImparNegativo);
       
        System.out.println(" Quantidade de números ímpares e negativos: " + somaNumeroImparNegativo);
       
        System.out.println(" Quantidade de números com o valor 0: " + somaNumeroZero);

    }
}