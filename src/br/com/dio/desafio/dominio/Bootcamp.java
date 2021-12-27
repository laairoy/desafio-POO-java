package br.com.dio.desafio.dominio;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private final Set<Dev> devsInscritos = new HashSet<>();
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return new HashSet<>(devsInscritos);
    }

    public void addDevsInscrito(Dev devsInscrito) {
        this.devsInscritos.add(devsInscrito);
    }

    public boolean removeDevsInscrito(Dev devsInscreto) {
        return this.devsInscritos.remove(devsInscreto);
    }

    public Set<Conteudo> getConteudos() {
        return new LinkedHashSet<>(conteudos);
    }

    public void addConteudo(Conteudo ... conteudo) {
        this.conteudos.addAll(Set.of(conteudo));
    }

    public boolean removeConteudo(Conteudo conteudo){
        return this.conteudos.remove(conteudo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return nome.equals(bootcamp.nome) && descricao.equals(bootcamp.descricao) && dataInicial.equals(bootcamp.dataInicial) && dataFinal.equals(bootcamp.dataFinal) && devsInscritos.equals(bootcamp.devsInscritos) && conteudos.equals(bootcamp.conteudos);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", devsInscritos=" + devsInscritos +
                ", conteudos=" + conteudos +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
