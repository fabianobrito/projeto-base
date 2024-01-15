package com.suaorganizacao.myapplication.projetobase.adapter.persistence.pedido;

import com.suaorganizacao.myapplication.projetobase.domain.model.Pedido;

public interface IPedidoDao {
    Pedido salvar(Pedido pedido);
    Pedido obterPorId(Long id);
}
