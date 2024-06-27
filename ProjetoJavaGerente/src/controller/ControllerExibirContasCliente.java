
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.ExibirContas;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControllerExibirContasCliente {
    
    private ExibirContas view;

    public ControllerExibirContasCliente(ExibirContas view) {
        this.view = view;
    }
    
    public void exibirContas(){
        // Instânciando um novo objeto de ArrayList.
        ArrayList<Cliente> clientesComConta = new ArrayList<>();
        Conexao conexao = new Conexao();
        try{
            // Utilizando variaveis de conexão.
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            // Consultando as contas.
            clientesComConta = dao.consultarContasCliente();
            // Se o ArrayList não estiver vazio...
            if (!clientesComConta.isEmpty()) {
                // Utilizando o StringBuilder para unir as contas em uma formatação de texto unica.
                StringBuilder textoClientes = new StringBuilder();
                // Utilizando o laço de repetição "for" para add cada conta no StringBuilder.
                for(Cliente cliente : clientesComConta){
                    textoClientes.append("Nome: ").append(
                            cliente.getNome()).append("\n");
                    textoClientes.append("CPF: ").append(
                            cliente.getCpf()).append("\n");
                    textoClientes.append("Tipo de Conta: ").append(
                            cliente.getTipoConta()).append("\n");
                    textoClientes.append("Saldo: ").append("R$ ").append(
                            cliente.getSaldo()).append("\n");
                    textoClientes.append("Senha: ").append(
                            cliente.getSenha()).append("\n\n");
                }
                // Exibindo todas as contas no GUI para o usuario.
                view.getTxtSaidaExibirContas().setText(
                        textoClientes.toString());
                JOptionPane.showMessageDialog(view,
                        "Contas consultadas com sucesso", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Erro se nenhuma conta foi encontrada.
                JOptionPane.showMessageDialog(view,
                        "Nenhuma conta encontrada", "Aviso",
                        JOptionPane.WARNING_MESSAGE);
                view.setVisible(false);
            }
        }catch(SQLException ex){
            // Erro de conexão
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
}
