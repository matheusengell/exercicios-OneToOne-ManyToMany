package atividade.fixacao_relacionamentos.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import atividade.fixacao_relacionamentos.dto.pessoa.PessoaRequestDto;
import atividade.fixacao_relacionamentos.dto.pessoa.PessoaResponseDto;
import atividade.fixacao_relacionamentos.model.Pessoa;

@Component
@RequiredArgsConstructor
public class PessoaMapper {

    public Pessoa toEntity(PessoaRequestDto requestDto) {
        return new Pessoa(
                requestDto.nome(),
                new DocumentoMapper().toEntity(requestDto.documento())
        );
    }

    public PessoaResponseDto toDto(Pessoa pessoa) {
        return new PessoaResponseDto(
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getDocumento() != null
                ? new DocumentoMapper().toDto(pessoa.getDocumento())
                        :null
        );
    }
}
