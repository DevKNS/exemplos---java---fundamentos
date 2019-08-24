/**
 * Funcionario
 */
public class Funcionario {

    public String nome;
    public int quantidadeHoras;
    public double valorHora, descontoPasse, descontoComida, auxilioTerno, auxilioCreche;

    // Método
    public double calcularSalarioBruto() {
        double salarioBruto = quantidadeHoras * valorHora;
        return salarioBruto;
    }

    public double calcularSalarioLiquido() {
        double valorAcrescimo = auxilioCreche + auxilioTerno;
        double valorDescontos = descontoComida + descontoPasse;
        double salarioBruto = calcularSalarioBruto();
        double salarioLiquido = salarioBruto - valorDescontos + valorAcrescimo;
        return salarioLiquido;

    }
}