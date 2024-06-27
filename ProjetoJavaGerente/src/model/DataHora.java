
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    
    private String data, hora;

    public DataHora() {
    }

    public DataHora(String data, String hora) {
        this.data = data;
        this.hora = hora;
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
    
    // Função para retornar a data atual em formato String.
    public String dateNow(){
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatter);
        return dataFormatada;
    }
    
    // Função para retornar o horário atual em formato String.
    public String timeNow(){
        LocalTime horarioAtual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "HH:mm:ss");
        String horarioFormatado = horarioAtual.format(formatter);
        return horarioFormatado;
    }

    @Override
    public String toString() {
        return "DataHora{" + "data=" + data + ", hora=" + hora + '}';
    }

}
