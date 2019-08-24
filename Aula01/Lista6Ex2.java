import java.util.Scanner;

/**
 * Lista6Ex2
 */
public class Lista6Ex2 {

    public static void main(String[] args) {
        // Var
        double mediaIdadeVoam, mediaAlturaNadam, animaisPossuemPulga;
        double somaIdadeVoam = 0;
        double somaAlturaAnimal = 0;
        int quantidadeRefeicoes = 0;
        int numero = 0;
        int apresentaPodeNadar = 0, apresentaPodeVoar = 0, apresentaPossuiRabo = 0, apresentaPossuiPulga = 0;
        Scanner teclado = new Scanner(System.in);
        while (numero <= 10) {

            System.out.println("Escreva o nome do animal: ");

            String nomeAnimal = teclado.nextLine();
            System.out.println("Escreva a quantidade de refeições do seu animal: ");

            quantidadeRefeicoes = Integer.parseInt(teclado.nextLine());

            System.out.println("Seu animal possui rabo? ");
            boolean possuiRabo = Boolean.parseBoolean(teclado.nextLine());

            System.out.println("Seu animal consegue nadar? ");
            boolean podeNadar = Boolean.parseBoolean(teclado.nextLine());

            System.out.println("Seu animal consegue voar? ");
            boolean podeVoar = Boolean.parseBoolean(teclado.nextLine());

            System.out.println("Seu animal possui pulga? ");
            boolean possuiPulga = Boolean.parseBoolean(teclado.nextLine());

            System.out.println("Qual a idade do seu animal");
            int idadeAnimal = Integer.parseInt(teclado.nextLine());

            System.out.println("Qual a altura do seu animal");
            int alturaAnimal = Integer.parseInt(teclado.nextLine());
            if (possuiRabo = true) {
                apresentaPossuiRabo = apresentaPossuiRabo + 1;
            }
            if (podeVoar = true) {
                apresentaPodeVoar = apresentaPodeVoar + 1;
            }
            if (podeNadar = true) {
                apresentaPodeNadar = apresentaPodeNadar + 1;
            }
            if (possuiPulga = true) {
                apresentaPossuiPulga = apresentaPossuiPulga + 1;
            }
            if (podeVoar = true && idadeAnimal > 0) {
                somaIdadeVoam = somaIdadeVoam + idadeAnimal;
            }
            if (alturaAnimal > 0 && podeNadar == true) {
                somaAlturaAnimal = somaAlturaAnimal + alturaAnimal;

            }

        }

        System.out.println("Animais que voam: " + apresentaPodeVoar);
        System.out.println("Animais que nadam: " + apresentaPodeNadar);
        System.out.println("Animais que possuen rabo: " + apresentaPossuiRabo);
        System.out.println("Animais que voam e que nadam: " + (apresentaPodeVoar + apresentaPodeNadar));
        System.out.println("Animais que possuem pulga: " + apresentaPossuiPulga);
        System.out.print("Media de idade dos animais que voam: " + (somaIdadeVoam / 11));
        System.out.print("Media de altura dos animais que nadam: " + somaAlturaAnimal / 11);

    }

}