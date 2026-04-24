package atividade.fixacao_relacionamentos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(mappedBy= "pessoa", cascade = CascadeType.ALL)
    private Documento documento;

    public Pessoa(String nome, Documento documento) {
        this.nome = nome;
        this.documento = documento;
    }
}
