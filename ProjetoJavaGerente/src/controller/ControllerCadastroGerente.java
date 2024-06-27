
package controller;

import DAO.GerenteDAO;
import DAO.Conexao;
import model.Gerente;
import view.CadastroGerente;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ControllerCadastroGerente {
    
    private CadastroGerente view;

    public ControllerCadastroGerente(CadastroGerente view) {
        this.view = view;
    }
    
    // Função para cadastrar gerente.
    public void salvarGerente(){
        //Recebendo os valores da entrada de dados da janela GUI.
        String nome = view.getTxtEntradaNomeCadastroGerente().getText();
        String login = view.getTxtEntradaLoginCadastroGerente().getText();
        String senha = view.getTxtEntradaSenhaCadastroGerente().getText();
        // Criando um novo objeto Gerente com os parâmetros solicitados.
        Gerente gerente = new Gerente(nome, login, senha);
        Conexao conexao = new Conexao();
        try{
            // Utilizando as váriaveis de conexão.
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            // Verificando se o login do gerente já existe (para não ter gerentes duplicados).
            int resposta = dao.verificarExistenciaGerente(gerente);
            if(resposta == 0){
                // Inserindo o novo gerente no sistema.
                dao.inserirGerente(gerente);
                JOptionPane.showMessageDialog(view,
                        "Gerente Cadastrado","Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
            view.setVisible(false);
            } else if(resposta == 1){
                // Erro de login já existente.
                JOptionPane.showMessageDialog(view,
                    "Login já cadastrado",
                    "Erro",JOptionPane.ERROR_MESSAGE);
                view.setVisible(false);
            }
        }catch(SQLException ex){
            // Falha de conexão.
            JOptionPane.showMessageDialog(view,
                    "Falha na conexão",
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
