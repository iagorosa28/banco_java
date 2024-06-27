
package model;

public class Cliente {
    protected String cpf;
    protected String conta;
    protected String nome;
    protected String senha;
    protected double saldo;

    public Cliente() {
    }

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(String cpf, double saldo) {
        this.cpf = cpf;
        this.saldo = saldo;
    }
    
    public Cliente(String nome, String cpf, String senha, String conta,
            double saldo) {
        this.cpf = cpf;
        this.conta = conta;
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", senha=" +
                senha + ", conta=" + conta + ", valorConta=" + saldo + '}';
    }

    public String saldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
