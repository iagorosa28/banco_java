
package model;

public class Gerente extends Pessoa{
    
    private String login;

    public Gerente() {
    }

    public Gerente(String login) {
        this.login = login;
    }

    public Gerente(String login, String nome, String senha) {
        super(nome, senha);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Gerente{" + "login=" + login + '}' + "Pessoa{" + "nome=" +
                nome + ", senha=" + senha + '}';
    }
    
}
