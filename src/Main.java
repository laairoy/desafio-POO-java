import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso de java");
        curso.setDescricao("Curso para aprendizado da lingugem java");
        curso.setCargaHoraria(8);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("descricao");
        mentoria.setData(LocalDate.of(2022, 1, 25));

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp");
        bootcamp.setDescricao("Descricao");
        bootcamp.addConteudo(mentoria, curso);

        System.out.println(bootcamp);

        Dev dev = new Dev("Joao");
        dev.inscreverBootcamp(bootcamp);

        System.out.println(dev);
        dev.progredir();
        dev.progredir();

        System.out.println(dev);

    }
}
