
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.DepositarCliente;
import view.DepositarClienteValor;


public class ControllerDepositarCliente {
    private DepositarCliente view;
    
    public ControllerDepositarCliente (DepositarCliente view){
        this.view = view;
    }
    
    public void entrarClienteDeposito(){
        Cliente cliente = new Cliente(null, 
                view.getCpfClienteDepositarEntrada().getText(), 
                view.getSenhaClienteDepositarEntrada1().getText(), 
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
                DepositarClienteValor viewDepositarClienteValor = 
                        new DepositarClienteValor(new Cliente(
                                nome, cpf, senha, tipoConta, saldo));
                ControllerDepositarClienteValor controllerDepositarValor =
                        new ControllerDepositarClienteValor(
                                viewDepositarClienteValor, cpf);
                viewDepositarClienteValor.setVisible(true);
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
