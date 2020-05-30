package com.example.controllermoney.api.repository.lancamento;

import java.time.LocalDate;
import java.util.List;

import com.example.controllermoney.api.dto.LancamentoEstatisticaCategoria;
import com.example.controllermoney.api.dto.LancamentoEstatisticaDia;
import com.example.controllermoney.api.dto.LancamentoEstatisticaPessoa;
import com.example.controllermoney.api.model.Lancamento;
import com.example.controllermoney.api.repository.filter.LancamentoFilter;
import com.example.controllermoney.api.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {
	
	public List<LancamentoEstatisticaPessoa> porPessoa(LocalDate inicio, LocalDate fim);
	public List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);
	public List<LancamentoEstatisticaDia> porDia(LocalDate mesReferencia);

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
