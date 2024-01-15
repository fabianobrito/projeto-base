package com.suaorganizacao.myapplication.projetobase.adapter.persistence.pedido;

import com.suaorganizacao.myapplication.projetobase.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepositorySpringData extends JpaRepository<Pedido, Long> {
}
