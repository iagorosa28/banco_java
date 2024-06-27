// Pacote
package model;

// Classe
public class Corrente extends TipoConta{

    //Construtores
    public Corrente() {
    }

    public Corrente(double taxa, double atributoLimite) {
        super(taxa, atributoLimite);
    }
    
    // Metodos 
    // Função para retornar o nome da conta.
    public String corrente(){
        return "Corrente";
    }
    
}
