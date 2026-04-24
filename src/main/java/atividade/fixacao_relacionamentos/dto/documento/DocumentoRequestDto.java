package atividade.fixacao_relacionamentos.dto.documento;

import jakarta.validation.constraints.NotBlank;

public record DocumentoRequestDto(
    
    @NotBlank(message="O número é obrigatório")
    String numero,

    @NotBlank(message="O tipo é obrigatório")
    String tipo
) {

}
