
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.ExibirExtratoCliente;
import view.ExibirExtratoClienteResultado;

public class ControllerExibirExtratoCliente {
    private ExibirExtratoCliente view;

    public ControllerExibirExtratoCliente(ExibirExtratoCliente view) {
        this.view = view;
    }
    
    public void entrarExibirExtrato(){
        Cliente cliente = new Cliente(null, 
                view.getCpfClienteExibirExtrato().getText(), 
                view.getSenhaClienteExibirExtrato().getText(), 
                null, 0.0);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            ResultSet res = dao.consultar(cliente);
            if(res.next()){
                JOptionPane.showMessageDialog(view, 
                        "Login Feito", "Aviso", 
                        JOptionPane.INFORMATION_MESSAGE);
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");
                String senha = res.getString("senha");
                String tipoConta = res.getString("conta");
                Double saldo = res.getDouble("saldo");
                ExibirExtratoClienteResultado viewExibirExtratoClienteResultado 
                        = new ExibirExtratoClienteResultado(new Cliente(
                                nome, cpf, senha, tipoConta, saldo));
                ControllerExibirExtratoResultado 
                        controllerExibirExtratoClienteResultado = 
                        new ControllerExibirExtratoResultado(
                                viewExibirExtratoClienteResultado, cpf);
                viewExibirExtratoClienteResultado.setVisible(true);
                view.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(view,
                        "Login não efetuado", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                view.setVisible(false);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view,
                    "Erro de conexão", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
}
