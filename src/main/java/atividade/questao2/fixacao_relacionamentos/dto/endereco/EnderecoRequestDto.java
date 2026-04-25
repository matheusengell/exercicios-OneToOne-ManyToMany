package atividade.questao2.fixacao_relacionamentos.dto.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record EnderecoRequestDto(
        @NotBlank(message = "A rua é obrigatória")
        String rua,

        @Positive(message = "O número deve ser positivo")
        @NotNull(message = "O número não pode ser nulo")
        Double numero
) {

}
