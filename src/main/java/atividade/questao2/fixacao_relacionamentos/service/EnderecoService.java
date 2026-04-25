package atividade.questao2.fixacao_relacionamentos.service;

import atividade.questao2.fixacao_relacionamentos.dto.endereco.EnderecoRequestDto;
import atividade.questao2.fixacao_relacionamentos.dto.endereco.EnderecoResponseDto;
import atividade.questao2.fixacao_relacionamentos.mapper.EnderecoMapper;
import atividade.questao2.fixacao_relacionamentos.model.Funcionario;
import atividade.questao2.fixacao_relacionamentos.model.Endereco;
import atividade.questao2.fixacao_relacionamentos.repository.FuncionarioRepository;
import atividade.questao2.fixacao_relacionamentos.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository repository;
    private final EnderecoMapper mapper;

    public EnderecoResponseDto criar(EnderecoRequestDto requestDto){
        Endereco endereco = mapper.toEntity(requestDto);
        repository.save(endereco);
        return mapper.toDto(endereco);
    }

    public List<EnderecoResponseDto> listar(){
        List<Endereco> enderecos = repository.findAll();

        return enderecos.stream()
                .map(mapper::toDto)
                .toList();
    }

}
