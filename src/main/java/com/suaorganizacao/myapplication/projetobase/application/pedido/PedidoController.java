package com.suaorganizacao.myapplication.projetobase.application.pedido;

import com.suaorganizacao.myapplication.projetobase.domain.model.Pedido;
import com.suaorganizacao.myapplication.projetobase.domain.usecase.IRealizarPedidoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class PedidoController implements IPedidoController {

    private final IRealizarPedidoUseCase realizarPedidoUseCase;

    @Override
    public ResponseEntity<Pedido> realizarPedido(PedidoRequest pedidoRequest) {
        Pedido pedidoRealizado = realizarPedidoUseCase.realizarPedido(pedidoRequest);
        return new ResponseEntity<>(pedidoRealizado, HttpStatus.CREATED);
    }
}
