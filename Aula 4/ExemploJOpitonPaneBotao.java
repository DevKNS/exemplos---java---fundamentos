import javax.swing.JOptionPane;


public class ExemploJOpitonPaneBotao {

    public static void main(String[] args) {
        String[] opcoes = new String[]{"Botão 1", "Botão 2", "Sair" };
        int opcao = 0;
        while(opcao != 2){
            opcao = JOptionPane.showOptionDialog(null, "Seleciona a opção desejada","TITULO", 0, JOptionPane.INFORMATION_MESSAGE, null, opcoes, 0);

            JOptionPane.showMessageDialog(null, "Opção: " + opcao);
        }    
        



    }
}