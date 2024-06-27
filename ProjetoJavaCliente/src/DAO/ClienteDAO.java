
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import model.Extrato;

public class ClienteDAO {
    private Connection conn;

    public ClienteDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Cliente cliente) throws SQLException{
        String sql = "select * from clientes where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.setString(2, cliente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void debitar(Cliente cliente) throws SQLException{
       String sql = "update clientes set saldo = ? where cpf = ? where senha = ?";
       PreparedStatement statement = conn.prepareStatement(sql);
       statement.setString(1, cliente.getSenha());
       statement.setString(2, cliente.getCpf());
       statement.setString(3, cliente.saldo());
       statement.execute();
       conn.close();
    }
    
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
    
    public String consultarContaCliente(Cliente cliente) throws SQLException {
        String sql = "select conta from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        ResultSet resultado = statement.executeQuery();
        String conta = null;
        if (resultado.next()) {
            conta = resultado.getString("conta");
        }
        return conta;
    }
    
        public void escolherSaldo(Cliente cliente) throws SQLException{
        String sql = "update clientes set saldo = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, cliente.getSaldo());
        statement.setString(2, cliente.getCpf());
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
    
    public ArrayList<Extrato> consultarExtratosCliente(Cliente cliente)
            throws SQLException{
        ArrayList<Extrato> extratosCliente = new ArrayList<>();
        String sql = "select * from extratos where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        ResultSet resultado = statement.executeQuery();
        while(resultado.next()){
            Extrato extrato = new Extrato();
            extrato.setCpf(resultado.getString("cpf"));
            extrato.setData(resultado.getString("data"));
            extrato.setHora(resultado.getString("hora"));
            extrato.setValor(resultado.getDouble("valor"));
            extrato.setTarifa(resultado.getDouble("tarifa"));
            extrato.setSaldo(resultado.getDouble("saldo"));
            extratosCliente.add(extrato);
        }
        return extratosCliente;
    }
    
}

