
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.CadastrarCliente;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ControllerCadastroCliente {
    
    private CadastrarCliente view;

    public ControllerCadastroCliente(CadastrarCliente view) {
        this.view = view;
    }
    
    // Função para cadastrar um novo cliente.
    public void salvarCliente(){
        // Recebendo os valores do usuário pelas as entradas de dados do GUI.
        String nome = view.getTxtEntradaNomeCadastrar().getText();
        String cpf = view.getTxtEntradaCPFCadastrar().getText();
        String senha = view.getTxtEntradaSenhaCadastrar().getText();
        // Instânciando um novo objeto cliente com os dados recebidos.
        Cliente cliente = new Cliente(cpf, null, 0.0, nome, senha);
        Conexao conexao = new Conexao();
        try{
            // Utilizando as váriaveis de conexão.
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            // Verificando se o CPF (cliente) já existe, para não duplicar clientes.
            int resposta = dao.verificarExistenciaCliente(cliente);
            if(resposta == 0){
                // Se o CPF não foi cadastrado, então cadastrar.
                dao.inserirCliente(cliente);
                JOptionPane.showMessageDialog(view,
                    "Cliente Cadastrado","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
                view.setVisible(false);
            }else if(resposta == 1){
                // Erro se o CPF já foi cadastrado.
                JOptionPane.showMessageDialog(view,
                    "CPF já cadastrado",
                    "Erro",JOptionPane.ERROR_MESSAGE);
                view.setVisible(false);
            }
        }catch(SQLException ex){
            // Erro de conexão.
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
        
    }
    
}
