package br.com.dio.desafio.escola;

public abstract class Atividade {
    protected static final double notaMax = 10d;

    private double nota;
    private String resumo;

    public abstract double calcularNota();

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
