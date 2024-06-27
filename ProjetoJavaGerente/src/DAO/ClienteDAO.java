// Pacote
package DAO;

// Importações
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cliente;
import model.Extrato;

// Classe
public class ClienteDAO {
    
    // Atributos
    private Connection conn;

    // Construtor
    public ClienteDAO(Connection conn) {
        this.conn = conn;
    }
    
    // Metodos
    
    // Função para consular os dados de um cliente no banco de dados (utilizando o CPF).
    public ResultSet consultarCliente(Cliente cliente) throws SQLException{
        String sql = "select * from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    // Função para consular o saldo de um cliente no banco de dados (utilizando o CPF).
    public double consultarSaldoCliente(Cliente cliente) throws SQLException {
        String sql = "select saldo from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        ResultSet resultado = statement.executeQuery();
        double saldo = 0.0;
        if (resultado.next()) {
            saldo = resultado.getDouble("saldo");
        }
        return saldo;
        }
    
    // Função para consultar os dados de todas as contas existentes no banco de dados.
    public ArrayList<Cliente> consultarContasCliente() throws SQLException{
        ArrayList<Cliente> clientesComConta = new ArrayList<>();
        String sql = "select * from clientes where conta is not null";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet resultado = statement.executeQuery();
        while(resultado.next()){
            Cliente cliente = new Cliente();
            cliente.setCpf(resultado.getString("cpf"));
            cliente.setTipoConta(resultado.getString("conta"));
            cliente.setSaldo(resultado.getDouble("saldo"));
            cliente.setNome(resultado.getString("nome"));
            cliente.setSenha(resultado.getString("senha"));
            clientesComConta.add(cliente);
        }
        return clientesComConta;
    }
    
    // Função para verificar a existência de um cliente no banco de dados (utilizando o CPF).
    public int verificarExistenciaCliente(Cliente cliente) throws SQLException {
        String sql = "SELECT COUNT(*) AS count FROM clientes WHERE cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        ResultSet resultado = statement.executeQuery();
        int count = 0;
        if (resultado.next()) {
            count = resultado.getInt("count");
        }
        return count > 0 ? 1 : 0;
    }
    
    // Função para inserir um cliente no banco de dados.
    public void inserirCliente(Cliente cliente) throws SQLException{
        String sql = "insert into clientes (nome, cpf, senha) values ('" 
                + cliente.getNome() + "','" + cliente.getCpf()+ "','" +
                cliente.getSenha()+ "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    // Função para inserir um extrato de um cliente no banco de dados.
    public void inserirExtrato(Extrato extrato) throws SQLException{
        String sql = "insert into extratos (cpf, data, hora, valor, tarifa, saldo)"
                + " values (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, extrato.getCpf());
        statement.setString(2, extrato.getData());
        statement.setString(3, extrato.getHora());
        statement.setDouble(4, extrato.getValor());
        statement.setDouble(5, extrato.getTarifa());
        statement.setDouble(6, extrato.getSaldo());
        statement.execute();
        conn.close();
    }
    
    // Função para criar ou atualizar conta do cliente no banco de dados (utilizando o CPF).
    public void escolherConta(Cliente cliente) throws SQLException{
        String sql = "update clientes set conta = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getTipoConta());
        statement.setString(2, cliente.getCpf());
        statement.execute();
        conn.close();
    }
    
    // Função para atualizar o saldo do cliente no banco de dados (utilizando o CPF).
    public void escolherSaldo(Cliente cliente) throws SQLException{
        String sql = "update clientes set saldo = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, cliente.getSaldo());
        statement.setString(2, cliente.getCpf());
        statement.execute();
        conn.close();
    }
    
    // Função para excluir um cliente no banco de dados (utilizando o CPF).
    public void removerCliente(Cliente cliente) throws SQLException{
        String sql = "delete from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.execute();
        conn.close();
    }
    
}
