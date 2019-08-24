valores padrões para atributos de objetos 
double = 0; 
int = 0;
boolean= false; 
String = null;


Metodos 


//Função 

public double calcularSalrioBruto() {
            double salarioBruto = quantidadeHoras * valorHora;						    <<=== Vai te retornar uma valor correspondente ao tipo de dado apos o public
            System.out.println("Salario Bruto; " + salarioBruto);
            return salarioBruto; 


//Procedure 
public void calcularSalarioLiquido() {
            double valorAcrescimo = auxilioCreche + auxilioTerno;
            double valorDescontos = descontoComida + descontoPasse;
            double salarioBruto = quantidadeHoras * valorHora;
            double salarioLiquido = salarioBruto - valorDescontos + valorAcrescimo;     <<==== vai te não vai te retornar
            System.out.println("Salário Líquido:  " + salarioLiquido);

                            


                            CONCEITO DE IO 
 	ShowImputDialog
 	->Input (entrada)
 	ShowMessageDialog
 	-> Output(saída)

 				


 				>>>>CRUD<<<<
 					CREAT						TODO SISTEMA TEM	
 					READ
 					UPDATE
 					DELETE


