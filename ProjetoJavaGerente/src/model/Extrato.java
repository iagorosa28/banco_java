
package model;

public class Extrato extends Cliente{
    
    private String data, hora;
    private double valor, tarifa;

    public Extrato() {
    }

    public Extrato(String cpf) {
        super(cpf);
    }

    public Extrato(String cpf, String data, String hora, double valor,
            double tarifa, double saldo) {
        super(cpf, saldo);
        this.data = data;
        this.hora = hora;
        this.valor = valor;
        this.tarifa = tarifa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Extrato{" + "data=" + data + ", hora=" + hora + ", valor=" +
                valor + ", tarifa=" + tarifa + '}' + "Cliente{" + "cpf=" + cpf +
                ", saldo=" + saldo + '}';
    }
    
}
