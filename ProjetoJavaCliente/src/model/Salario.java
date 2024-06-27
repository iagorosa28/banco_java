
package model;

public class Salario extends TiposDeConta{

    public Salario() {
    }

    public Salario(double taxa, double limite) {
        super(taxa, limite);
    }
    
//    public void calculoTaxa(){
//        taxa = 0.05;
//        double valorTaxa = valorDebito * taxa;
//        if (valorTaxa > limite){
//            System.out.println("Não foi possível realizar a operação");
//        }
//        else{
//            limite = limite - valorTaxa;
//        }
//    }
}
