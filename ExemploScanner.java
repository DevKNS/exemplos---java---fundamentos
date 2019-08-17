import java.util.Scanner;




public class ExemploScanner{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println ("Nome: ");
		String nome = teclado.nextLine();
		
		System.out.println ("Idade: ");
		int idade = Integer.parseInt(teclado.nextLine());

		teclado.nextLine(); 
		System.out.println (nome);
		System.out.println (idade);


		System.out.print("Empregado?: ");
		boolean empregado = Boolean.parseBoolean (teclado.nextLine());
		double salario; 
		System.out.println ("");
		System.out.println ("");
		System.out.println("");
		System.out.println ("Nome: " + nome);
		System.out.println ("Idade" + idade);
		System.out.println ("Salário: " + salario);
		System.out.println("Empregado: " + empregado);
	}

}