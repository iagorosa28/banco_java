
package controller;
import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.ExibirSaldoExibindo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControllerExibindoSaldoCliente {
    
    private ExibirSaldoExibindo view;
    private String cpf;

    public ControllerExibindoSaldoCliente(ExibirSaldoExibindo view, String cpf){
        this.view = view;
        this.cpf = cpf;
    }
    
    public void exibirSaldo(){
        // Instânciando um novo objeto Cliente com o CPF recebido de outro controller.
        Cliente cliente = new Cliente(cpf);
        Conexao conexao = new Conexao();
        try{
            // Utilizando variaveis de conexão.
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            double saldoCliente = dao.consultarSaldoCliente(cliente);
            // Exibindo o saldo no GUI.
            view.getTxtSaidaExibirSaldo().setText("R$ " +
                    String.valueOf(saldoCliente));
        }catch(SQLException ex){
            // Erro de conexão.
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }

}
