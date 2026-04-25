package atividade.questao2.fixacao_relacionamentos.mapper;

import atividade.questao2.fixacao_relacionamentos.dto.funcionario.FuncionarioRequestDto;
import atividade.questao2.fixacao_relacionamentos.dto.funcionario.FuncionarioResponseDto;
import atividade.questao2.fixacao_relacionamentos.model.Funcionario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FuncionarioMapper {

    public Funcionario toEntity(FuncionarioRequestDto requestDto){
        return new Funcionario(
                requestDto.nome(),
                new EnderecoMapper().toEntity(requestDto.endereco())
        );
    }

    public FuncionarioResponseDto toDto(Funcionario funcionario){
        return new FuncionarioResponseDto(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getEndereco() != null
                ? new EnderecoMapper().toDto(funcionario.getEndereco()) :null
        );
    }

}
