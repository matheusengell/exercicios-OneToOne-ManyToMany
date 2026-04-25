package atividade.questao1.fixacao_relacionamentos.controller;

import atividade.questao1.fixacao_relacionamentos.dto.pessoa.PessoaRequestDto;
import atividade.questao1.fixacao_relacionamentos.dto.pessoa.PessoaResponseDto;
import atividade.questao1.fixacao_relacionamentos.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService service;

    @PostMapping
    public ResponseEntity<PessoaResponseDto> cadastrar(@RequestBody PessoaRequestDto requestDto){
    return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.cadastrar(requestDto));
    }

    @GetMapping
    public ResponseEntity<List<PessoaResponseDto>> listarTodos(){
        List<PessoaResponseDto> pessoa = service.listarTodos();
        return ResponseEntity.ok(pessoa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponseDto> listarPorId(@PathVariable Long id){
        return ResponseEntity.ok(service.listarPorId(id));
    }

}
