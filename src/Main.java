import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso c++");
        curso2.setDescricao("Descrição curso c++");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java intermediário");
        bootcamp.setDescricao("Praticando POO em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Halyson");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Halyson: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos Halyson: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Halyson: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());


        System.out.println("------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Ricardo");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Ricardo: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos inscritos Ricardo: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Ricardo: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());




    }
}
