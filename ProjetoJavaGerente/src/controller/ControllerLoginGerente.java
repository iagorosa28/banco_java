
package controller;

import DAO.GerenteDAO;
import DAO.Conexao;
import model.Gerente;
import view.LoginGerente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.MenuGerente;

public class ControllerLoginGerente {
    
    private LoginGerente view;

    public ControllerLoginGerente(LoginGerente view) {
        this.view = view;
    }
    
    // Função para realizar o login do gerente.
    public void loginGerente(){
        //Recebendo os valores da entrada de dados da janela GUI.
        // Criando um novo objeto Gerente com os parâmetros solicitados.
        Gerente gerente = new Gerente(view.getTxtEntradaLogin().getText(), 
                null, view.getTxtEntradaSenha().getText());
        Conexao conexao = new Conexao();
        try{
            // Utilizando as váriaveis de conexão.
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            // Consultadando os dados do gerente para o login.
            ResultSet res = dao.consultarGerente(gerente);
            if(res.next()){
                JOptionPane.showMessageDialog(view,
                        "Login Feito", "Aviso", 
                        JOptionPane.INFORMATION_MESSAGE);
                // Utilizando os dados do gerente para acessar o MenuGerente.
                String nome = res.getString("nome");
                String login = res.getString("login");
                String senha = res.getString("senha");
                MenuGerente viewGerente = new MenuGerente(
                        new Gerente(login, nome, senha));
                viewGerente.setVisible(true);
                view.setVisible(false);
            }else{
                // Erro no login.
                JOptionPane.showMessageDialog(view,
                        "Login não efetuado", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            // Erro de conexão.
            JOptionPane.showMessageDialog(view,
                    "Erro de conexão", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
