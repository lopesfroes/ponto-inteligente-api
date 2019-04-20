package com.btec.pontointeligente.api.service;

import java.util.Optional;

import com.btec.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

	/**
	 * Retorna uma empresa dado um CNPJ
	 * 
	 * @param cnpj
	 * @return
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastrar uma empresa
	 * 
	 * @param Empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
}
