
package controller;

import DAO.GerenteDAO;
import DAO.Conexao;
import model.Gerente;
import view.ExcluirGerente;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ControllerExcluirGerente {
    
    private ExcluirGerente view;

    public ControllerExcluirGerente(ExcluirGerente view) {
        this.view = view;
    }
    
    // Função para excluir gerente.
    public void excluirGerente(){
        //Recebendo os valores da entrada de dados da janela GUI.
        // Criando um novo objeto Gerente com os parâmetros solicitados.
        Gerente gerente = new Gerente(
                view.getTxtEntradaLoginExcluir().getText()
        );
        Conexao conexao = new Conexao();
        try{
            // Utilizando as váriaveis de conexão.
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            // Consultando os dados do gerente que deseja excluir.
            ResultSet res = dao.consultarGerenteLogin(gerente);
            if(res.next()){
                // Excluindo gerente.
                dao.removerGerente(gerente);
                JOptionPane.showMessageDialog(view,
                        "Gerente Excluído", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                view.setVisible(false);
            }else{
                // Erro de gerente não encontrado.
                JOptionPane.showMessageDialog(view,
                        "Gerente não encontrado", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            // Falha na conexão.
            JOptionPane.showMessageDialog(view,
                    "Erro de conexão", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
