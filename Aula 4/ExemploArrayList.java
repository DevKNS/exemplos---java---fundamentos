
import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        //ADD -> adcionar elemento do ArrayList (vetor)
        numeros.add(19); numeros.add(20);   numeros.add(23); numeros.add(027); numeros.add(60);
        
        // Remove -> passar a posição
        numeros.remove(0);

        numeros.set(1,22);
        
        numeros.add(50);
        System.out.println(numeros);

        boolean contem19 = numeros.contains(19);
        System.out.println("Contem 19: " + contem19);

        int tamanho = numeros.size();
        System.out.println("Tamanho " + tamanho);
    }
}