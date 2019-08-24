import java.util.Scanner;

/**
 * ListaExercicio02
 */
public class ListaExercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Escreva seu sobrenome: ");
        String sobrenome = teclado.nextLine();

        System.out.println("Escreva sua primeira nota: ");
        double nota1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Escreva sua segunda nota");
        double nota2 = Double.parseDouble(teclado.nextLine());

        System.out.println("Escreva sua terceira nota");
        double nota3 = Double.parseDouble(teclado.nextLine());

        System.out.println("Escreva sua quarta nota");
        double nota4 = Double.parseDouble(teclado.nextLine());
        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;

        System.out.println("Olá " + nome + sobrenome + " Suas notas são: " + nota1 + " / " + nota2 + " / " + nota3
                + " / " + nota4);
        System.out.println("Sua média foi: " + media);

        if (media > 7) {
            System.out.println("Aprovado");

        } else if (media < 5) {

            System.out.println("Reprovado");
        } else {
            System.out.println("Recuperação");
        }

    }
}