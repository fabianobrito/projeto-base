package com.suaorganizacao.myapplication.projetobase.adapter.persistence.produto;

import com.suaorganizacao.myapplication.projetobase.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorySpringData extends JpaRepository<Produto,Long> {
    Produto findByNome(String nome);
}
