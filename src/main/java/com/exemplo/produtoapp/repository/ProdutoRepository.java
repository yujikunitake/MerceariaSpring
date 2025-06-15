package com.exemplo.produtoapp.repository;
import com.exemplo.produtoapp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
