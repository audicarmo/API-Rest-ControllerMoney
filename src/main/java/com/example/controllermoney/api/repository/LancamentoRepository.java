package com.example.controllermoney.api.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.controllermoney.api.model.Lancamento;
import com.example.controllermoney.api.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
	
	List<Lancamento> findByDataVencimentoLessThanEqualAndDataPagamentoIsNull(LocalDate data);

}
