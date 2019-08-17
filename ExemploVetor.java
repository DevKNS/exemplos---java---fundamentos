/**
 * ExemploVetor
 */
public class ExemploVetor {

    public static void main(String[] args) {
        int[] numeros = new int [5];

        numeros[0] = 10;
        numeros[1] = 30;
        numeros[2] = 50;
        numeros[3] = 70;
        numeros[4] = 90;
        int soma = numeros [0] + numeros[1] + numeros[2] + numeros [3] + numeros [4];
        System.out.println("[0] -> "+ numeros[0]);
        System.out.println("[1] -> "+ numeros[1]);  
        System.out.println("[2] -> "+ numeros[2]);
        System.out.println("[3] -> "+ numeros[3]);
        System.out.println("[4] -> "+ numeros[4]);
        System.out.println("SOMA " + soma);
    }    
}