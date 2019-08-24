import java.util.Scanner;

/**
 * PrincipalCachorro
 */
public class PrincipalCachorro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Cachorro cachorro1 = new Cachorro();
      
        System.out.println("Nome do Doguinho: ");
        cachorro1.nome = teclado.nextLine();     
        
        System.out.println("Raça do doguinho: ");      
        cachorro1.raca = teclado.nextLine();        

        System.out.println("Quantos anos tem seu doguinho? ");
        cachorro1. idade = Integer.parseInt(teclado.nextLine());

        
        System.out.println("Cor do seu doguinho: ");
        cachorro1.cor = teclado.nextLine();
       
        System.out.println("Peso do seu doguinho: ");
        cachorro1.peso = Double.parseDouble(teclado.nextLine());
        
        System.out.println("Seu doguinho é castrado? ");
        cachorro1.castrado = Boolean.parseBoolean(teclado.nextLine());
        
        System.out.println("Seu doguinho é macho ou femea? ");
        cachorro1.sexo = teclado.nextLine();
         
        Cachorro cachorro2 = new Cachorro();

        
        System.out.println("Nome do Doguinho: ");
        cachorro2.nome = teclado.nextLine();     
        
        System.out.println("Raça do doguinho: ");      
        cachorro2.raca = teclado.nextLine();        

        System.out.println("Quantos anos tem seu doguinho? ");
        cachorro2.idade = Integer.parseInt(teclado.nextLine());

        
        System.out.println("Cor do seu doguinho: ");
        cachorro2.cor = teclado.nextLine();
       
        System.out.println("Peso do seu doguinho: ");
        cachorro2.peso = Double.parseDouble(teclado.nextLine());
        
        System.out.println("Seu doguinho é castrado? ");
        cachorro2.castrado = Boolean.parseBoolean(teclado.nextLine());
        
        System.out.println("Seu doguinho é macho ou femea? ");
        cachorro2.sexo = teclado.nextLine();
        
        
        System.out.println("Nomes dos Cachorros: " + cachorro1.nome + "|" + cachorro2.nome);
        System.out.println("/n");
        
        System.out.println("Raças dos cachorros:  " + cachorro1.raca + "|" + cachorro2.raca);
        System.out.println("/n");
        System.out.println("Idade dos Cachorros: " + cachorro1.idade + "|" + cachorro2.idade);
        System.out.println("/n");
        System.out.println ("cadastrados " + cachorro1.cor + "|" + cachorro2.cor);
        System.out.println("/n");
        System.out.println("Peso dos cachorros cadastrados " + cachorro1.peso + "|" + cachorro2.peso);
        System.out.println("/n");
        System.out.println("Cachorros castrados e não castrados: " + cachorro1.castrado + "|" + cachorro2.castrado); 
        System.out.println("/n");
        System.out.println("Sexo dos cachorros cadastrados: " + cachorro1.sexo + "|" + cachorro2.sexo);
    }    


}

