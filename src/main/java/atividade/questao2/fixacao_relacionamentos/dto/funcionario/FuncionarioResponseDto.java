package atividade.questao2.fixacao_relacionamentos.dto.funcionario;

import atividade.questao2.fixacao_relacionamentos.dto.endereco.EnderecoResponseDto;

public record FuncionarioResponseDto(
        Long id,
        String nome,
        EnderecoResponseDto endereco
) {

}
