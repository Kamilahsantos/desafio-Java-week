package com.linuxtips.challengejavaweek.repository;

import com.linuxtips.challengejavaweek.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
