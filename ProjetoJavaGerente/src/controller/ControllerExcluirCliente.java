
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.ExcluirCliente;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ControllerExcluirCliente {
    
    private ExcluirCliente view;

    public ControllerExcluirCliente(ExcluirCliente view) {
        this.view = view;
    }

    public void excluirCliente(){
        // Recebendo os valores do usuário pelas as entradas de dados do GUI.
        // E, instânciando um novo objeto Cliente.
        Cliente cliente = new Cliente(
                view.getTxtEntradaCPFExcluir().getText());
        Conexao conexao = new Conexao();
        try{
            // Utilizando as váriaveis de conexão.
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            // Verificando a existência do cliente para exclusão.
            ResultSet res = dao.consultarCliente(cliente);
            if(res.next()){
                // Excluindo cliente.
                dao.removerCliente(cliente);
                JOptionPane.showMessageDialog(view,
                        "Cliente Excluído", "Aviso", 
                        JOptionPane.INFORMATION_MESSAGE);
                view.setVisible(false);
            }else{
                // Erro de cliente não encontrado.
                JOptionPane.showMessageDialog(view,
                        "Cliente não encontrado", "Erro", 
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
