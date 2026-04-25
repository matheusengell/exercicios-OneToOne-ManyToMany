package atividade.questao2.fixacao_relacionamentos.dto.funcionario;

import atividade.questao2.fixacao_relacionamentos.dto.endereco.EnderecoRequestDto;
import jakarta.validation.constraints.NotBlank;

public record FuncionarioRequestDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome,
        EnderecoRequestDto endereco
) {

}
