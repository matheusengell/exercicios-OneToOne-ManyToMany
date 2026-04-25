package atividade.questao2.fixacao_relacionamentos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Funcionario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String nome;

    @OneToOne(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private Endereco endereco;


    public Funcionario(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
}
