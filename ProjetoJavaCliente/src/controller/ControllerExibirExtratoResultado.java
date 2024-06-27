
package controller;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Extrato;
import view.ExibirExtratoClienteResultado;


public class ControllerExibirExtratoResultado {
    private ExibirExtratoClienteResultado view;
    private String cpf;

    public ControllerExibirExtratoResultado(ExibirExtratoClienteResultado view,
            String cpf) {
        this.view = view;
        this.cpf = cpf;
    }
    
    public void exibirExtrato(){
        ArrayList<Extrato> extratosCliente = new ArrayList<>();
        Cliente cliente = new Cliente(cpf);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClienteDAO dao = new ClienteDAO(conn);
            extratosCliente = dao.consultarExtratosCliente(cliente);
            if (!extratosCliente.isEmpty()) {
                StringBuilder textoExtratos = new StringBuilder();
                for(Extrato extrato : extratosCliente){
                    textoExtratos.append("CPF: ").append(
                            extrato.getCpf()).append("\n");
                    textoExtratos.append("Data: ").append(
                            extrato.getData()).append("\n");
                    textoExtratos.append("Hora: ").append(
                            extrato.getHora()).append("\n");
                    textoExtratos.append("Valor: ").append("R$ ").append(
                            extrato.getValor()).append("\n");
                    textoExtratos.append("Tarifa: ").append(
                            extrato.getTarifa() * 100).append(
                                    "%").append("\n");
                    textoExtratos.append("Saldo: ").append("R$ ").append(
                            extrato.getSaldo()).append("\n\n");
                    
                }
                view.getTxtSaidaExibirContas().setText(
                        textoExtratos.toString());
                JOptionPane.showMessageDialog(view,
                        "Extratos consultados com sucesso", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view,
                        "Nenhum extrato encontrado", "Aviso",
                        JOptionPane.WARNING_MESSAGE);
                view.setVisible(false);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            view.setVisible(false);
        }
    }
}

