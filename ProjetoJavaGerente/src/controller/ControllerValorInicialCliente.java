
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import model.Cliente;
import view.ValorInicial;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.DataHora;
import model.Extrato;

public class ControllerValorInicialCliente {
    
    private ValorInicial view;
    private String cpf;

    public ControllerValorInicialCliente(ValorInicial view, String cpf) {
        this.view = view;
        this.cpf = cpf;
    }
    
    public void valorInicial(){
        // Instânciando o objeto DataHora.
        DataHora dataHora = new DataHora();
        // Recebendo o valor inicial com a interface GUI.
        double valorInicial = Double.parseDouble(
                view.getTxtEntradaValorInicialCriar().getText());
        // Instânciando um novo cliente.
        Cliente cliente = new Cliente(cpf, null, valorInicial,
                null, null);
        // Instânciando o objeto de extrado.
        Extrato extrato = new Extrato(cpf, dataHora.dateNow(),
                dataHora.timeNow(), valorInicial, 0.0,
                valorInicial);
        Conexao conexao = new Conexao();
        try{
            // Utilizando as variaveis de conexão. obs: tive que instânciar dois Connection para não dar erro de conexão.
            Connection conn1 = conexao.getConnection();
            Connection conn2 = conexao.getConnection();
            ClienteDAO dao1 = new ClienteDAO(conn1);
            ClienteDAO dao2 = new ClienteDAO(conn2);
            // Escolhedo saldo e add novo extrato.
            dao1.escolherSaldo(cliente);
            dao2.inserirExtrato(extrato);
            JOptionPane.showMessageDialog(view,
                    "Saldo Aberto","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            view.setVisible(false);
        }catch(SQLException ex){
            // Erro de conexão.
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
    
}
