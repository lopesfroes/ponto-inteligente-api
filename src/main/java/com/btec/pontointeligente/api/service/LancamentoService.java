package com.btec.pontointeligente.api.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.btec.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {

	/**
	 * 
	 * @param id
	 * @param pageRequest
	 * @return Page<Lancamento>
	 */
	Page<Lancamento> buscarFuncionarioId(Long id, PageRequest pageRequest);
	
	/**
	 * Retorna um lançamento por ID.
	 * 
	 * @param id
	 * @return Optional<Lancamento>
	 */
	Optional<Lancamento> buscarPorId(Long id);
	
	/**
	 * Persiste um lançamento na base de dados.
	 * 
	 * @param lancamento
	 * @return Lancamento
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 * Remove um lançamento da base de dados.
	 * 
	 * @param id
	 */
	void remover(Long id);
}
