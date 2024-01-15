package com.suaorganizacao.myapplication.projetobase.domain.usecase;


import com.suaorganizacao.myapplication.projetobase.adapter.persistence.pedido.IPedidoDao;
import com.suaorganizacao.myapplication.projetobase.adapter.persistence.produto.IProdutoDao;
import com.suaorganizacao.myapplication.projetobase.application.pedido.PedidoRequest;
import com.suaorganizacao.myapplication.projetobase.domain.model.ItemPedido;
import com.suaorganizacao.myapplication.projetobase.domain.model.Pedido;
import com.suaorganizacao.myapplication.projetobase.domain.model.Produto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RealizarPedidoUseCase implements IRealizarPedidoUseCase {

    private final IPedidoDao pedidoRepository;
    private final IProdutoDao produtoRepository;

    @Override
    public Pedido realizarPedido(PedidoRequest pedidoRequest) {
        Pedido novoPedido = new Pedido();
        Produto produto = produtoRepository.obterPorNome(pedidoRequest.getProduto());
        ItemPedido itemPedido = new ItemPedido(produto, pedidoRequest.getQuantidade());
        novoPedido.getItens().add(itemPedido);
        novoPedido.setQuantidade(pedidoRequest.getQuantidade());

        // Persiste o pedido usando o gateway
        return pedidoRepository.salvar(novoPedido);
    }
}
