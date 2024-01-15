package com.suaorganizacao.myapplication.projetobase.application.pedido;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PedidoRequest {
    @NotBlank(message = "O campo 'produto' é obrigatório")
    private String produto;

    @Positive(message = "A quantidade deve ser um número positivo")
    private int quantidade;
}
