import javax.swing.JOptionPane;

/**
 * ExemploJOptionPaneConfirmação
 */
public class ExemploJOptionPaneConfirmacao {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar?", "AVISO", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (opcao == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Apagado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Ta safe jovi");
        }
        opcao = JOptionPane.showConfirmDialog(null, "Empregado?", "AVISO", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        boolean empregado;

        if (opcao == JOptionPane.YES_NO_CANCEL_OPTION) {
            empregado = true;
        } else {
            empregado = false;
        }

    }
}