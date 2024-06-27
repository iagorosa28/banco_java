
package model;


public class TiposDeConta {
    protected double taxa;
    protected double limite;

    public TiposDeConta() {
    }

    public TiposDeConta(double taxa, double limite) {
        this.taxa = taxa;
        this.limite = limite;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "TiposDeConta{" + "taxa=" + taxa + ", limite=" + limite + '}';
    }
    
}
