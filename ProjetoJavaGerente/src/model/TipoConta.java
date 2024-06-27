
package model;

public class TipoConta {
    
    protected double taxa, atributoLimite;

    public TipoConta() {
    }

    public TipoConta(double taxa, double atributoLimite) {
        this.taxa = taxa;
        this.atributoLimite = atributoLimite;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getAtributoLimite() {
        return atributoLimite;
    }

    public void setAtributoLimite(double atributoLimite) {
        this.atributoLimite = atributoLimite;
    }

    @Override
    public String toString() {
        return "TipoConta{" + "taxa=" + taxa + ", atributoLimite=" +
                atributoLimite + '}';
    }

    
}
