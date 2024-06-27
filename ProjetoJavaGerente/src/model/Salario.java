
package model;

public class Salario extends TipoConta{

    public Salario() {
    }

    public Salario(double taxa, double atributoLimite) {
        super(taxa, atributoLimite);
    }
    
    // Função para retornar o nome da conta.
    public String salario(){
        return "Salário";
    }
    
}
