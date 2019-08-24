public class ExemplosOperadoresLogicos{  

	public static void main (String[] args) {
		/*Operadores Lógicos 
		 &&      				      E
		|| (pipeline)	              Ou
		 	E

		 V E V -> V
		 V E F -> F
		 F E F -> F
				
			OU

		 V OU V -> V
		 V OU F -> V
		 F OU F -> F
		 */ 
		double salario = 100;
		if ((salario > 100) && (salario < 700)){
			System.out.print ("Estag");

		}else if((salario >= 700) && (salario <= 7000)){
			System.out.println ("Efetiovo");
		}else{
			System.out.print ("PJ");
		}	

		boolean limpouCarro = true;
		boolean lavouCarro = true; 

		if ((limpouCarro == true) || (lavouCarro == true)){
			System.out.print ("Gift Card do Fortnite");
		}else{
			System.out.print ("Sem dinheirinho pra comprar skin");
		}
}	}	

