package org.example.cati.model.produto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.cati.model.produto.dto.ProdutoDTO;
import org.example.cati.model.unidade.UnidadeDeNegocio;

@Entity(name = "produto")
@Table(name = "produto")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Produto implements ProdutoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id;
    @NotBlank
    @Column(name = "nome_produto")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_unidade")
    private UnidadeDeNegocio unidadeDeNegocio;
}
