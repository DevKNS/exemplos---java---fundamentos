import java.util.Scanner;

/**
 * jogo
 */
public class PrincipalJogo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        //Instanciado um objeto chamado jogo1 da classe Jogo!
        Jogo jogo1 = new Jogo();
       
        System.out.println("Nome ");
        jogo1.nome = teclado.nextLine();

        System.out.println("Quantidade: ");
        jogo1.quantidade = Integer.parseInt(teclado.nextLine());

        System.out.println("Preços: ");
        jogo1.preco = Double.parseDouble(teclado.nextLine());
double precoJogo1 = jogo1.quantidade * jogo1.preco;
        Jogo jogo2 = new Jogo();
        double precoJogo2 = jogo2.quantidade * jogo2.preco;

        System.out.println("Nome: ");
        jogo2.nome = teclado.nextLine();

        System.out.println("Quantidade: ");
        jogo2.quantidade = Integer.parseInt(teclado.nextLine());

        System.out.println("Preço: ");
        jogo2.preco = Double.parseDouble(teclado.nextLine());


        double total = precoJogo1 + precoJogo2; 
        System.out.println("Total: " + total);

    }
}