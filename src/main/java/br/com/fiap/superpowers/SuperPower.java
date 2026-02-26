package br.com.fiap.superpowers;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "superpoder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperPower {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    @Column(name = "nivel_inutilidade ")
    private int nivelInutilidade;
}
