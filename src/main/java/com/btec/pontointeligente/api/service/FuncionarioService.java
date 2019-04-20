package com.btec.pontointeligente.api.service;

import java.util.Optional;

import com.btec.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {

	/**
	 * Salvar um funcionario 
	 * 
	 * @param funcionario
	 * @return
	 */
	Funcionario salvar(Funcionario funcionario);
	
	/**
	 * Buscar um funcionario pelo n° cpf
	 * 
	 * @param cpf
	 * 
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Buscar um funcionario pelo e-mail
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPrEmail(String email);
	
	/**
	 * Buscar um funcionario pelo n° id
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(Long id);
	
}
