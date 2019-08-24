import javax.swing.JOptionPane;

/**
 * ExemploJOptionPaneSelecao
 */
public class ExemploJOptionPaneSelecao {

    public static void main(String[] args) {
       /* String [] opcoes = new String [4];
        opcoes[0] = "Moba";
        opcoes[1] = "FPS";
        opcoes[2] = "RPG";
        opcoes[3] = "CPrroda";
        */
        String[] opcoes = new String[]{
            "Moba", "FPS", "RPG", "Corrida"
        };
        String opcao = JOptionPane.showInputDialog(null, "Selecione o tipo", "TÍTULO", JOptionPane.QUESTION_MESSAGE, null, opcoes, 0).toString();
        JOptionPane.showMessageDialog(null, "TIPO SELECIONADO" + opcoes);
    }


}