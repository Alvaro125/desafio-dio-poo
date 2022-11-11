package br.com.dio.desafio.escola;

import br.com.dio.desafio.dominio.Conteudo;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Aluno {
    private String nome;
    private Set<Atividade> materiasInscritos = new LinkedHashSet<>();
    private Set<Atividade> materiasConcluidos = new LinkedHashSet<>();

    public void matricularMateria(Materia materia){
        this.materiasInscritos.addAll(materia.getAtividades());
        materia.getAlunos().add(this);
    }
    public void progredir(double nota){
        Optional<Atividade> atividade = this.materiasInscritos.stream().findFirst();
        if(atividade.isPresent()){
            atividade.get().setNota(nota);
            this.materiasConcluidos.add(atividade.get());
            this.materiasInscritos.remove(atividade.get());
        }else{
            System.out.println("Você não Atividades para serem feitas.");
        }
    }

    public double calcularMedia(){
        double concluidos = this.materiasConcluidos
                .stream()
                .count();
        double inscrito = this.materiasInscritos
                .stream()
                .count();
        double total = this.materiasConcluidos
                .stream()
                .mapToDouble(atividade->atividade.calcularNota())
                .sum();
        return total/(inscrito+concluidos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Atividade> getMateriasInscritos() {
        return materiasInscritos;
    }

    public void setMateriasInscritos(Set<Atividade> materiasInscritos) {
        this.materiasInscritos = materiasInscritos;
    }

    public Set<Atividade> getMateriasConcluidos() {
        return materiasConcluidos;
    }

    public void setMateriasConcluidos(Set<Atividade> materiasConcluidos) {
        this.materiasConcluidos = materiasConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(materiasInscritos, aluno.materiasInscritos) && Objects.equals(materiasConcluidos, aluno.materiasConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, materiasInscritos, materiasConcluidos);
    }
}
