package atividade.fixacao_relacionamentos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Documento {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String numero;

    @Column(nullable=false)
    private String tipo;

    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;


    public Documento(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    

    
}
