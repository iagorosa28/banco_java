
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import model.DataHora;
import model.Extrato;
import view.DepositarClienteValor;


public class ControllerDepositarClienteValor {
    private DepositarClienteValor view;
    private String cpf;
    
    public ControllerDepositarClienteValor (DepositarClienteValor view,
            String cpf){
        this.view = view;
        this.cpf = cpf;
    }
    
    public void depositar(){
        DataHora dataHora = new DataHora();
        Cliente cliente = new Cliente(cpf);
        double deposito = Double.parseDouble(
                view.getValorClienteDepositarEntrada().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn1 = conexao.getConnection();
            Connection conn2 = conexao.getConnection();
            ClienteDAO dao1 = new ClienteDAO(conn1);
            ClienteDAO dao2 = new ClienteDAO(conn2);
            double saldo = dao1.consultarSaldoCliente(cliente);
            double novoDeposito = saldo + deposito;
            cliente.setSaldo(novoDeposito);
            dao1.escolherSaldo(cliente);
            Extrato extrato = new Extrato(cpf, dataHora.dateNow(),
                    dataHora.timeNow(), deposito, 0.0, 
                    novoDeposito);
            dao2.inserirExtrato(extrato);
            JOptionPane.showMessageDialog(view,
                    "Deposito Realizado",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            view.setVisible(false);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha de conexão",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
}
