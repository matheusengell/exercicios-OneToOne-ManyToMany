package atividade.fixacao_relacionamentos.controller;

import atividade.fixacao_relacionamentos.dto.documento.DocumentoRequestDto;
import atividade.fixacao_relacionamentos.dto.documento.DocumentoResponseDto;
import atividade.fixacao_relacionamentos.service.DocumentoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documento")
@RequiredArgsConstructor
public class DocumentoController {

    private final DocumentoService service;

    @PostMapping
    public ResponseEntity<DocumentoResponseDto> cadastrar(@RequestBody DocumentoRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.cadastrar(requestDto));
    }

    @GetMapping
    public ResponseEntity<List<DocumentoResponseDto>> listar(){
        List<DocumentoResponseDto> documento = service.listar();
        return ResponseEntity.ok(documento);
    }
}
