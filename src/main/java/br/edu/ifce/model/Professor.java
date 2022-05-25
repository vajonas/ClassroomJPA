package br.edu.ifce.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_professor")
public class Professor {
    @Id
    @GeneratedValue
    private Long id;
    
    private String nome_professor;
    
    @ManyToMany(mappedBy="professor")
    private Collection<Turma> turma = new ArrayList<Turma>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public Collection<Turma> getTurma() {
        return turma;
    }

    public void setTurma(Collection<Turma> turma) {
        this.turma = turma;
    }
  
}
