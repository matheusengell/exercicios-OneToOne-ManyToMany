package atividade.fixacao_relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import atividade.fixacao_relacionamentos.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long>{

}
