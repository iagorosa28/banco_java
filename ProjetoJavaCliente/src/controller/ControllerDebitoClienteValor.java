
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import model.DataHora;
import model.Extrato;
import view.DebitarClienteValor;

public class ControllerDebitoClienteValor {
    private DebitarClienteValor view;
    private String cpf;
    
    public ControllerDebitoClienteValor (DebitarClienteValor view, String cpf){
        this.view = view;
        this.cpf = cpf;
    }
    
    public void debitar(){
        DataHora dataHora = new DataHora();
        Cliente cliente = new Cliente(cpf);
        double debito = Double.parseDouble(
                view.getValorCienteDebitarEntrada().getText());
        double debitoExtrato = - debito;
        Conexao conexao = new Conexao();
        try{
            Connection conn1 = conexao.getConnection();
            Connection conn2 = conexao.getConnection();
            ClienteDAO dao1 = new ClienteDAO(conn1);
            ClienteDAO dao2 = new ClienteDAO(conn2);
            String conta = dao1.consultarContaCliente(cliente);
            double saldo = dao1.consultarSaldoCliente(cliente);
            if (conta.equals("Poupança")){
                if(saldo < debito){
                    JOptionPane.showMessageDialog(view,
                            "Operação Inválida", "Aviso", 
                            JOptionPane.INFORMATION_MESSAGE);
                    view.setVisible(false);
                }
                else{
                    double novoDebito = saldo - debito;
                    cliente.setSaldo(novoDebito);
                    dao1.escolherSaldo(cliente);
                    Extrato extrato = new Extrato(cpf, dataHora.dateNow(),
                dataHora.timeNow(), debitoExtrato, 0.0, 
                            novoDebito);
                    dao2.inserirExtrato(extrato);
                    JOptionPane.showMessageDialog(view,
                            "Debito Realizado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    view.setVisible(false);
                }
            }
            else if (conta.equals("Corrente")){
                double limite = -1.000;
                double taxa = 0.01;
                double novaTaxa = debito * taxa;
                double valorTotal = debito + novaTaxa;
                double novoDebito = saldo - valorTotal;
                if(novoDebito < limite){
                    JOptionPane.showMessageDialog(view,
                            "Operação Inválida",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    view.setVisible(false);
                }
                else{
                    cliente.setSaldo(novoDebito);
                    dao1.escolherSaldo(cliente);
                    Extrato extrato = new Extrato(cpf, dataHora.dateNow(),
                dataHora.timeNow(), debitoExtrato, taxa, 
                            novoDebito);
                    dao2.inserirExtrato(extrato);
                    JOptionPane.showMessageDialog(view,
                            "Debito Realizado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    view.setVisible(false);
                }
            }
            else{
                double taxa = 0.05;
                double novaTaxa = debito * taxa;
                double valorTotal = debito + novaTaxa;
                double novoDebito = saldo - valorTotal;
                if(saldo < novoDebito){
                    JOptionPane.showMessageDialog(view,
                            "Operação Inválida",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    view.setVisible(false);
                }
                else{
                    cliente.setSaldo(novoDebito);
                    dao1.escolherSaldo(cliente);
                    Extrato extrato = new Extrato(cpf, dataHora.dateNow(),
                dataHora.timeNow(), debitoExtrato, taxa, 
                            novoDebito);
                    dao2.inserirExtrato(extrato);
                    JOptionPane.showMessageDialog(view,
                            "Debito Realizado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    view.setVisible(false);
                }
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha de conexão",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
}
