package com.suaorganizacao.myapplication.projetobase.adapter.persistence.pedido;

import com.suaorganizacao.myapplication.projetobase.domain.model.Pedido;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class PedidoDao implements IPedidoDao {

    private final PedidoRepositorySpringData pedidoRepositorySpringData;

    @Override
    public Pedido salvar(Pedido pedido) {
        return pedidoRepositorySpringData.save(pedido);
    }

    @Override
    public Pedido obterPorId(Long id) {
        return pedidoRepositorySpringData.findById(id).orElse(null);
    }
}
