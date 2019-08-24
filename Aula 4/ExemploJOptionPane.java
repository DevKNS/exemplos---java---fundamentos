import javax.swing.JOptionPane;

/**
 * ExemploJOptionPane
 */

public class ExemploJOptionPane {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello World");
        JOptionPane.showMessageDialog(null, "Segunda mensagem", "Aviso",
        JOptionPane.ERROR_MESSAGE);
    }
}