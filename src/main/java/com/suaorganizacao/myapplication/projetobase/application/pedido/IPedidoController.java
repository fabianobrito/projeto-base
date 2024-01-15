package com.suaorganizacao.myapplication.projetobase.application.pedido;

import com.suaorganizacao.myapplication.projetobase.domain.model.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pedido")
public interface IPedidoController {

    @PostMapping
    ResponseEntity<Pedido> realizarPedido(@RequestBody PedidoRequest pedidoRequest);
}
