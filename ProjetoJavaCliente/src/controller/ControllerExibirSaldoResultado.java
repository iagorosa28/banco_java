
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.ExibirSaldoClienteResultado;


public class ControllerExibirSaldoResultado {
    private ExibirSaldoClienteResultado view;
    private String cpf;

    public ControllerExibirSaldoResultado(ExibirSaldoClienteResultado view,
            String cpf) {
        this.view = view;
        this.cpf = cpf;
    }
    
    public void exibirSaldo(){
        Cliente cliente = new Cliente(cpf);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            double saldoCliente = dao.consultarSaldoCliente(cliente);
            view.getTxtSaidaExibirContas().setText(
                    "R$ " + String.valueOf(saldoCliente));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
}
