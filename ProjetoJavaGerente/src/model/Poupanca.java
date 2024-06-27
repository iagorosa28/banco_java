
package model;

public class Poupanca extends TipoConta{

    public Poupanca() {
    }

    public Poupanca(double taxa, double atributoLimite) {
        super(taxa, atributoLimite);
    }
    
    // Função para retornar o nome da conta.
    public String poupanca(){
        return "Poupança";
    }
    
}
