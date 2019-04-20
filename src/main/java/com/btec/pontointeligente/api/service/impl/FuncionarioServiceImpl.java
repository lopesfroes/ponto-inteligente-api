package com.btec.pontointeligente.api.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btec.pontointeligente.api.entities.Funcionario;
import com.btec.pontointeligente.api.repositories.FuncionarioRepository;
import com.btec.pontointeligente.api.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{

	
	private static final Logger logger = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Override
	public Funcionario salvar(Funcionario funcionario) {
		logger.info("Salvando funcionario : {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		logger.info("Buscnado Funcionario de CPF {} :" , cpf );
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}

	@Override
	public Optional<Funcionario> buscarPrEmail(String email) {
		logger.info("Buscnado Funcionario pelo E-MAIL {} :" , email );
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}

	@Override
	public Optional<Funcionario> buscarPorId(Long id) {
		logger.info("Buscnado Funcionario de ID {} :" , id );
		return this.funcionarioRepository.findById(id);
	}

}
