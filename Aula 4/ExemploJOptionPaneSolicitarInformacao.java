import javax.swing.JOptionPane;

/**
 * ExemploJOptionPaneSolicitarInformação
 */


public class ExemploJOptionPaneSolicitarInformacao {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog ("Digite o nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("digite a idade"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
        boolean vivo = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite o salário"));
        JOptionPane.showMessageDialog(null,
        "Nome: " + nome + 
        "/nIdade: " + idade +
        "/nSalario: " + salario +
        "/nVivo " + vivo);   
             

        
    }
}