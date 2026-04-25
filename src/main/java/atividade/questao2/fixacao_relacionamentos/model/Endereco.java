package atividade.questao2.fixacao_relacionamentos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private Double numero;

    @OneToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;


    public Endereco(String rua, Double numero) {
        this.rua = rua;
        this.numero = numero;
    }
}
