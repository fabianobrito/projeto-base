package com.suaorganizacao.myapplication.projetobase.adapter.persistence.produto;

import com.suaorganizacao.myapplication.projetobase.domain.model.Produto;

public interface IProdutoDao {
    Produto obterPorNome(String nome);
}
