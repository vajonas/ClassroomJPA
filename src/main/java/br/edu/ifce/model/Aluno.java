package br.edu.ifce.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_aluno")
public class Aluno {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome_aluno;
	
	@ManyToMany(mappedBy="aluno")
    private Collection<Turma> turma = new ArrayList<Turma>();
	
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public Collection<Turma> getTurma() {
        return turma;
    }

    public void setTurma(Collection<Turma> turma) {
        this.turma = turma;
    }
}
	
	
