package br.edu.ifce.code;

import java.io.IOException;
import javax.persistence.EntityManager;
import br.edu.ifce.Utils.JPAUtil;
import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Conteudo;
import br.edu.ifce.model.Professor;
import br.edu.ifce.model.Turma;

public class JpaClassroom {

	public static void main(String args[]) throws IOException {

		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		
		Professor professor = new Professor();
		professor.setNome_professor("Fulana de Tal");
		
        Conteudo conteudo = new Conteudo();
        conteudo.setConteudo_nome("Cálculo");
		
		Turma turma = new Turma();
		turma.setNome_turma("Matemática");
		turma.setConteudo(conteudo);
		turma.getProfessor().add(professor);
		
        Aluno aluno = new Aluno();
        aluno.setNome_aluno("Fulano de Tal");
        aluno.getTurma().add(turma);
                        
		manager.persist(professor);
		manager.persist(conteudo);
		manager.persist(turma);
		manager.persist(aluno);
		
		
		manager.getTransaction().commit();
		manager.close();
		
		
	}

}
