package br.com.dio.desafio.escola;

import java.time.LocalDate;

public class Trabalho extends Atividade{
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataEntrega = dataInicial.plusDays(30);

    @Override
    public double calcularNota() {
        return getNota();
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return "Trabalho{\n" +
                "\t nota=" + getNota() +
                ", \n\tdataInicial=" + dataInicial +
                ", \n\tdataEntrega=" + dataEntrega +
                "\n}";
    }
}
