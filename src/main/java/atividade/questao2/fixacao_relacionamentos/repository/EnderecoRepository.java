package atividade.questao2.fixacao_relacionamentos.repository;

import atividade.questao2.fixacao_relacionamentos.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

    boolean existsByNumero(Double numero);
}
