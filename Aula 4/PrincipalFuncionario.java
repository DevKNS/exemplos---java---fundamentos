/**
 * PrincipalFuncionario
 */
public class PrincipalFuncionario {

    public static void main(String[] args) {
        Funcionario kelvin = new Funcionario();
        kelvin.nome = "Kelvin";
        kelvin.quantidadeHoras = 20;
        kelvin.valorHora = 500;
        kelvin.auxilioTerno = 2000;
        kelvin.auxilioCreche = 500;
        kelvin.descontoComida = 10;
        kelvin.descontoPasse = 0; 
        double salarioBruto = kelvin.calcularSalarioBruto();        
        double salarioLiquido = kelvin.calcularSalarioLiquido();
    
        System.out.println(salarioBruto);
        System.out.println(salarioLiquido);

    }
}