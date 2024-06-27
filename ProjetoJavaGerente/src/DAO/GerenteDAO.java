
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Gerente;

public class GerenteDAO {
    
    private Connection conn;

    public GerenteDAO(Connection conn) {
        this.conn = conn;
    }
    
    // Função para consultar um gerente no banco de dados para fazer login (utilizando o login e a senha).
    public ResultSet consultarGerente(Gerente gerente) throws SQLException{
        String sql = "select * from gerentes where login = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getLogin());
        statement.setString(2, gerente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    // Função para consultar os dados de um gerente no banco de dados (utilizando o login).
    public ResultSet consultarGerenteLogin(Gerente gerente) throws SQLException{
        String sql = "select * from gerentes where login = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getLogin());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    // Função para verificar a existência de um gerente no banco de dados (utilizando o login).
    public int verificarExistenciaGerente(Gerente gerente) throws SQLException {
        String sql = "SELECT COUNT(*) AS count FROM gerentes WHERE login = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getLogin());
        ResultSet resultado = statement.executeQuery();
        int count = 0;
        if (resultado.next()) {
            count = resultado.getInt("count");
        }
        return count > 0 ? 1 : 0;
    }
    
    // Função para inserir um gerente no banco de dados.
    public void inserirGerente(Gerente gerente) throws SQLException{
        String sql = "insert into gerentes (nome, login, senha) values ('" +
                gerente.getNome() + "','" + gerente.getLogin()+ "','" + 
                gerente.getSenha() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    // Função para excluir um gerente do banco de dados (utilizando o login).
    public void removerGerente(Gerente gerente) throws SQLException{
        String sql = "delete from gerentes where login = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getLogin());
        statement.execute();
        conn.close();
    }
    
}
