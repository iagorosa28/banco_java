
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.ExibirSaldo;
import view.ExibirSaldoExibindo;

public class ControllerExibirSaldoCliente {
    
    private ExibirSaldo view;

    public ControllerExibirSaldoCliente(ExibirSaldo view) {
        this.view = view;
    }
    
    public void entrarExibirSaldo(){
        // Recebendo o CPF da entrada de dados do GUI.
        String cpf = view.getTxtEntradaCPFExibir().getText();
        // Instânciando um novo cliente com o CPF.
        Cliente cliente = new Cliente(cpf);
        Conexao conexao = new Conexao();
        try{
            // Utilizando as variaveis de conexão.
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            // Consultando a existencia do cliente.
            ResultSet res = dao.consultarCliente(cliente);
            if(res.next()){
                JOptionPane.showMessageDialog(view,
                        "CPF permitido", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                // Passando para próxima página para exibir o saldo, e passando o CPF para reaproveitar.
                ExibirSaldoExibindo viewExibirSaldo =
                        new ExibirSaldoExibindo(cliente);
                ControllerExibindoSaldoCliente controllerExibindoSaldo = 
                        new ControllerExibindoSaldoCliente(
                                viewExibirSaldo, cpf);
                viewExibirSaldo.setVisible(true);
                view.setVisible(false);
            }else{
                // Erro de CPF não existente.
                JOptionPane.showMessageDialog(view,
                        "CPF não existente", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                view.setVisible(false);
            }
        }catch(SQLException e){
            // Erro de conexão.
            JOptionPane.showMessageDialog(view,
                    "Erro de conexão", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
}
