package atividade.questao1.fixacao_relacionamentos.service;

import atividade.questao1.fixacao_relacionamentos.dto.documento.DocumentoRequestDto;
import atividade.questao1.fixacao_relacionamentos.dto.documento.DocumentoResponseDto;
import atividade.questao1.fixacao_relacionamentos.mapper.DocumentoMapper;
import atividade.questao1.fixacao_relacionamentos.model.Documento;
import atividade.questao1.fixacao_relacionamentos.repository.DocumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentoService {

    private final DocumentoRepository repository;
    private final DocumentoMapper mapper;

    public DocumentoResponseDto cadastrar(DocumentoRequestDto requestDto){
        Documento documento = mapper.toEntity(requestDto);
        repository.save(documento);
        return mapper.toDto(documento);
    }

    public List<DocumentoResponseDto> listar(){
        List<Documento> documentos = repository.findAll();

        return documentos.stream()
                .map(mapper::toDto)
                .toList();
    }


}
