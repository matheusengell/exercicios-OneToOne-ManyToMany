package atividade.questao2.fixacao_relacionamentos.service;

import atividade.questao2.fixacao_relacionamentos.dto.funcionario.FuncionarioRequestDto;
import atividade.questao2.fixacao_relacionamentos.dto.funcionario.FuncionarioResponseDto;
import atividade.questao2.fixacao_relacionamentos.mapper.FuncionarioMapper;
import atividade.questao2.fixacao_relacionamentos.model.Endereco;
import atividade.questao2.fixacao_relacionamentos.model.Funcionario;
import atividade.questao2.fixacao_relacionamentos.repository.EnderecoRepository;
import atividade.questao2.fixacao_relacionamentos.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionarioRepository repository;
    private final FuncionarioMapper mapper;
    private final EnderecoRepository enderecoRepository;

    public FuncionarioResponseDto cadastrar(FuncionarioRequestDto requestDto){
        Endereco endereco = mapper.toEntity(requestDto).getEndereco();

        if (enderecoRepository.existsByNumero(endereco.getNumero())){
            throw new RuntimeException("Enderço não existe");
        }

        Funcionario funcionario = mapper.toEntity(requestDto);
        funcionario.getEndereco().setFuncionario(funcionario);
        repository.save(funcionario);
        return mapper.toDto(funcionario);
    }

}
