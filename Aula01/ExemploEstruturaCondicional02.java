public class ExemploEstruturaCondicional02{
	public static void main(String[] args){
	
		int numero = 0;
		// Operadores Relacionais 
		// == 			Igual
		// >			Maior 
		//>= 			Maior ou igual
		//<				Menor 
		//<= 			Menor ou Igual 
		//	!= 			Diferente (! é uma negação do java, ou seja nega a igualdade)


		if (numero >= 1){
			System.out.println ("Positivo");
		}else if (numero <= -1){
			System.out.println ("Negativo");
		}else{
			System.out.println ("Neutro");
		}
	}
}