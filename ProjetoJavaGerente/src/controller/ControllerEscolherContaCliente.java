
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.EscolherConta;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.ValorInicial;
import model.Poupanca;
import model.Corrente;
import model.Salario;

public class ControllerEscolherContaCliente {
    
    private EscolherConta view;
    private String cpf;
    
    public ControllerEscolherContaCliente(EscolherConta view, String cpf) {
        this.view = view;
        this.cpf = cpf;
    }
    
    public void contaPoupanca(){
        // Instânciando um objeto Poupanca.
        Poupanca p = new Poupanca();
        // Instânciando um novo objeto cliente com os valores recebidos do objeto Poupanca.
        Cliente cliente = new Cliente(cpf, p.poupanca(), 0.0,
                null, null);
        Conexao conexao = new Conexao();
        try{
            // Utilizando as váriaveis de conexão.
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            // Criando a conta.
            dao.escolherConta(cliente);
            JOptionPane.showMessageDialog(view,
                    "Conta Poupança Selecionada","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            // Passando para próxima página passando o CPF do cliente para reutilizar.
            ValorInicial viewValorInicial = new ValorInicial(new Cliente(cpf));
                ControllerValorInicialCliente controllerValorInicial = 
                        new ControllerValorInicialCliente(
                                viewValorInicial, cpf);
                viewValorInicial.setVisible(true);
                view.setVisible(false);
        }catch(SQLException ex){
            // Erro de conexão.
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
    // Mesma coisa da contaPoupanca só que para conta corrente.
    public void contaCorrente(){
        Corrente c = new Corrente();
        Cliente cliente = new Cliente(cpf, c.corrente(), 0.0,
                null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            dao.escolherConta(cliente);
            JOptionPane.showMessageDialog(view,
                    "Conta Corrente Selecionada","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            ValorInicial viewValorInicial = new ValorInicial(new Cliente(cpf));
                ControllerValorInicialCliente controllerValorInicial = 
                        new ControllerValorInicialCliente(
                                viewValorInicial, cpf);
                viewValorInicial.setVisible(true);
                view.setVisible(false);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
    // Mesma coisa da contaPoupanca só que para conta sálario.
    public void contaSalario(){
        Salario s = new Salario();
        Cliente cliente = new Cliente(cpf, s.salario(), 0.0,
                null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            dao.escolherConta(cliente);
            JOptionPane.showMessageDialog(view,
                    "Conta Salário Selecionada","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            ValorInicial viewValorInicial = new ValorInicial(new Cliente(cpf));
                ControllerValorInicialCliente controllerValorInicial = 
                        new ControllerValorInicialCliente(
                                viewValorInicial, cpf);
                viewValorInicial.setVisible(true);
                view.setVisible(false);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
}
