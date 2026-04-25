package atividade.questao1.fixacao_relacionamentos.dto.pessoa;

import atividade.questao1.fixacao_relacionamentos.dto.documento.DocumentoRequestDto;
import jakarta.validation.constraints.NotBlank;

public record PessoaRequestDto(
    @NotBlank(message="O nome é obrigatório")
    String nome,
    DocumentoRequestDto documento
) {

}
