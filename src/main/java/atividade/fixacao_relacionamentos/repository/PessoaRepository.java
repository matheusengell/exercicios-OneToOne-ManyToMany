package atividade.fixacao_relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import atividade.fixacao_relacionamentos.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{


}
