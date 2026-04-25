package atividade.questao1.fixacao_relacionamentos.dto.pessoa;

import atividade.questao1.fixacao_relacionamentos.dto.documento.DocumentoResponseDto;

public record PessoaResponseDto(
    Long id,
    String nome,
    DocumentoResponseDto documento
) {

}
