package br.com.dio.desafio.escola;

import java.time.LocalDate;

public class Prova extends Atividade{
    private LocalDate data;

    @Override
    public double calcularNota() {
        return getNota();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Prova{\n" +
                "\tnota=" + getNota() +
                "\n\tdata=" + data +
                "\n}";
    }
}
