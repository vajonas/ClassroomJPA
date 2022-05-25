package br.edu.ifce.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_conteudo")
public class Conteudo {
    @Id
    @GeneratedValue
    private Long id;
    
    @OneToOne(mappedBy="conteudo", cascade = CascadeType.ALL)
    private Turma turma;
    
    private String conteudo_nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo_nome;
    }

    public void setConteudo(String nome) {
        this.conteudo_nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getConteudo_nome() {
        return conteudo_nome;
    }

    public void setConteudo_nome(String conteudo_nome) {
        this.conteudo_nome = conteudo_nome;
    }
}
