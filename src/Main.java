import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.escola.Aluno;
import br.com.dio.desafio.escola.Materia;
import br.com.dio.desafio.escola.Prova;
import br.com.dio.desafio.escola.Trabalho;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Curso curso1 = new Curso();
//        curso1.setTitulo("curso java");
//        curso1.setDescricao("descrição curso java");
//        curso1.setCargaHoraria(8);
//
//        Curso curso2 = new Curso();
//        curso2.setTitulo("curso js");
//        curso2.setDescricao("descrição curso js");
//        curso2.setCargaHoraria(4);
//
//        Mentoria mentoria = new Mentoria();
//        mentoria.setTitulo("mentoria de java");
//        mentoria.setDescricao("descrição mentoria java");
//        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

//        Bootcamp bootcamp = new Bootcamp();
//        bootcamp.setNome("Bootcamp Java Developer");
//        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
//        bootcamp.getConteudos().add(curso1);
//        bootcamp.getConteudos().add(curso2);
//        bootcamp.getConteudos().add(mentoria);
//
//        Dev devCamila = new Dev();
//        devCamila.setNome("Camila");
//        devCamila.inscreverBootcamp(bootcamp);
//        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
//        devCamila.progredir();
//        devCamila.progredir();
//        System.out.println("-");
//        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
//        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
//        System.out.println("XP:" + devCamila.calcularTotalXP());
//
//        System.out.println("------------------------------------------");
//
//        Dev devJoao = new Dev();
//        devJoao.setNome("Joao");
//        devJoao.inscreverBootcamp(bootcamp);
//        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
//        devJoao.progredir();
//        devJoao.progredir();
//        devJoao.progredir();
//        System.out.println("-");
//        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
//        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
//        System.out.println("XP:" + devJoao.calcularTotalXP());

        Prova prova1 = new Prova();
        prova1.setData(LocalDate.now());
        prova1.setResumo("Prova de Aritmetica");

        Prova prova2 = new Prova();
        prova2.setData(LocalDate.now());
        prova2.setResumo("Prova de Equações quadraticas");

        Trabalho trabalho1 = new Trabalho();
        trabalho1.setResumo("Trabalho de trigonometria");

        Materia matematica = new Materia();
        matematica.setNome("Matemática");
        matematica.setDescricao("Aulas de segunda a sexta");
        matematica.getAtividades().add(prova1);
        matematica.getAtividades().add(prova2);
        matematica.getAtividades().add(trabalho1);

        Aluno alunoMateus = new Aluno();
        alunoMateus.setNome("Mateus");
        alunoMateus.matricularMateria(matematica);
        System.out.println("Conteúdos Inscritos Mateus:" + alunoMateus.getMateriasInscritos());
        alunoMateus.progredir(10d);
        alunoMateus.progredir(9d);
        alunoMateus.progredir(8d);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mateus:" + alunoMateus.getMateriasInscritos());
        System.out.println("Conteúdos Concluídos Mateus:" + alunoMateus.getMateriasConcluidos());
        System.out.println("XP:" + alunoMateus.calcularMedia());

    }
}