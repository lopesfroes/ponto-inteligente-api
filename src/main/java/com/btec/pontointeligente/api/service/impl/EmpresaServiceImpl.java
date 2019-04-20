package com.btec.pontointeligente.api.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btec.pontointeligente.api.entities.Empresa;
import com.btec.pontointeligente.api.repositories.EmpresaRepository;
import com.btec.pontointeligente.api.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpresaServiceImpl.class);

	@Autowired
	EmpresaRepository empresaRepository;
	
	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		logger.info("Buscando uma empresa com cnpj : ", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		logger.info("Salvando enmpresa {} ", empresa);
		return this.empresaRepository.save(empresa);
	}

}
