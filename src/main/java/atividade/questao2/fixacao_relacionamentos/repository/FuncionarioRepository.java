package atividade.questao2.fixacao_relacionamentos.repository;

import atividade.questao2.fixacao_relacionamentos.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
