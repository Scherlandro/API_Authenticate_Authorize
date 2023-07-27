package com.authenticate.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "produto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_produto;

    @Column( length = 12)
    private String cod_produto;

    @Column( length = 60)
    private String nome_produto;

    @Column( length = 8)
    private Double valor_compra;

    @Column( length = 8)
    private Double percentual;

    @Column( length = 8)
    private Double valor_venda;

    @Column( length = 11)
    private Integer quantidade_estoque;


    @JsonFormat(pattern = "dd/MM/yyyy")
    private String dt_cadastro;


}
