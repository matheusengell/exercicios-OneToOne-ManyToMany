package atividade.questao1.fixacao_relacionamentos.service;

import atividade.questao1.fixacao_relacionamentos.dto.pessoa.PessoaRequestDto;
import atividade.questao1.fixacao_relacionamentos.dto.pessoa.PessoaResponseDto;
import atividade.questao1.fixacao_relacionamentos.mapper.PessoaMapper;
import atividade.questao1.fixacao_relacionamentos.model.Documento;
import atividade.questao1.fixacao_relacionamentos.model.Pessoa;
import atividade.questao1.fixacao_relacionamentos.repository.DocumentoRepository;
import atividade.questao1.fixacao_relacionamentos.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository repository;
    private final DocumentoRepository documentoRepository;
    private final PessoaMapper mapper;


    public PessoaResponseDto cadastrar(PessoaRequestDto requestDto){
        Documento documento = mapper.toEntity(requestDto).getDocumento();

        if (documentoRepository.existsByNumero(documento.getNumero())){
            throw new RuntimeException("Documento já cadastrado");
        }
        Pessoa pessoa = mapper.toEntity(requestDto);
        pessoa.getDocumento().setPessoa(pessoa); // ← liga aqui
        repository.save(pessoa);
        return mapper.toDto(pessoa);
    }

    public List<PessoaResponseDto> listarTodos(){
        List<Pessoa> pessoas = repository.findAll();

        return pessoas.stream()
                .map(mapper::toDto)
                .toList();
    }

    public PessoaResponseDto listarPorId(Long id){
        Pessoa pessoa = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Pessoa não encontrada"));

        return mapper.toDto(pessoa);
    }
}
