package com.authenticate.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="enderecos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoModel {

    @Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, length = 20)
    private String cep;

    @Column(nullable = false, length = 80)
    private String logradouro;

    @Column(nullable = false, length = 50)
    private String bairro;

    @Column(nullable = false, length = 50)
    private String cidade;

    @Column(nullable = false, length = 50)
    private String estado;

    @OneToOne(fetch = FetchType.EAGER)
    private PaisModel pais = getPais();

}
