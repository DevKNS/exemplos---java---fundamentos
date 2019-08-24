
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SistemaContaPagar {

    ArrayList<ContaPagar> contas = new ArrayList<>();

    public void adicionar() {
        ContaPagar conta = new ContaPagar();
        conta.nome = JOptionPane.showInputDialog("Digite o nome da conta");
        conta.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta"));

    }

    public void editar() {
    }

    public void listar() {
        String textoContas = "";
        for(int i = 0; i < contas.size(); i++){
            ContaPagar conta = contas.get(i){
                textoContas = textoContas + conta.nome + "R$" + conta.valor + "/n";

            }
            
        }
        JOptionPane.showMessageDialog(null,textoContas);
    }

    public void apagar() {
    }

    public void menu() {
        adicionar();
    }
}
