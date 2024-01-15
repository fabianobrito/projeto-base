package com.suaorganizacao.myapplication.projetobase.domain.usecase;

import com.suaorganizacao.myapplication.projetobase.application.pedido.PedidoRequest;
import com.suaorganizacao.myapplication.projetobase.domain.model.Pedido;

public interface IRealizarPedidoUseCase {
    Pedido realizarPedido(PedidoRequest pedidoRequest);
}
