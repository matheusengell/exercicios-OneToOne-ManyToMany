package atividade.questao2.fixacao_relacionamentos.mapper;

import atividade.questao2.fixacao_relacionamentos.dto.endereco.EnderecoRequestDto;
import atividade.questao2.fixacao_relacionamentos.dto.endereco.EnderecoResponseDto;
import atividade.questao2.fixacao_relacionamentos.model.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnderecoMapper {

    public Endereco toEntity(EnderecoRequestDto requestDto){
        return new Endereco(
                requestDto.rua(),
                requestDto.numero()
        );
    }

    public EnderecoResponseDto toDto(Endereco endereco){
        return new EnderecoResponseDto(
                endereco.getId(),
                endereco.getRua(),
                endereco.getNumero()
        );
    }
}
