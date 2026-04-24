package atividade.fixacao_relacionamentos.mapper;

import atividade.fixacao_relacionamentos.dto.documento.DocumentoRequestDto;
import atividade.fixacao_relacionamentos.dto.documento.DocumentoResponseDto;
import atividade.fixacao_relacionamentos.model.Documento;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DocumentoMapper {

    public Documento toEntity(DocumentoRequestDto requestDto){
        return new Documento(
            requestDto.numero(),
            requestDto.tipo()
        );
    }

    public DocumentoResponseDto toDto(Documento documento){
        return new DocumentoResponseDto(
            documento.getId(),
            documento.getNumero(),
            documento.getTipo()
        );
    }
}
