package com.suaorganizacao.myapplication.projetobase.adapter.persistence.produto;

import com.suaorganizacao.myapplication.projetobase.domain.model.Produto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class ProdutoDao implements IProdutoDao {
    private final ProdutoRepositorySpringData produtoRepositorySpringData;

    @Override
    public Produto obterPorNome(String nome) {
        return this.produtoRepositorySpringData.findByNome(nome);
    }
}
