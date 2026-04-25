package atividade.questao1.fixacao_relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import atividade.questao1.fixacao_relacionamentos.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long>{

    boolean existsByNumero(String numero);
}
