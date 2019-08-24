/**
 * PrincipalGato
 */
public class PrincipalGato {

    public static void main(String[] args) {
        Gato felix = new Gato();
        
        felix.raca = "vira-lata";
        felix.quantidadeMiadas = 8000;
        felix.quantidadeVidas = 3;
        
        Gato gatoAjato = new Gato();
        
        gatoAjato.raca = "Siames";
        gatoAjato.quantidadeVidas = 5;
        gatoAjato.quantidadeMiadas = 3000;

        Gato tom = new Gato();
        tom.raca = "persa";
        tom.quantidadeVidas = 2;
        tom.quantidadeMiadas = 3;

        //========================\\
        int mediaVidas = (felix.quantidadeVidas + gatoAjato.quantidadeVidas + tom.quantidadeVidas) / 3;
        int mediaMiadas = (felix.quantidadeMiadas + gatoAjato.quantidadeMiadas + tom.quantidadeMiadas) / 3;
        
        System.out.println("Media de Miadas:" + mediaMiadas);    
        System.out.println("Media de Vidas: " + mediaVidas);
    }

}