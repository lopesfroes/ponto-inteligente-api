package com.btec.pontointeligente.api.repositories;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.btec.pontointeligente.api.entities.Empresa;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class EmpresaRepositoryTest {

	@Autowired
	private EmpresaRepository empresaRepository; 
	
	private static final String CNPJ = "514636450001000";
	
	@Before
	public void setUp()throws Exception{
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Empresa de Teste");
		empresa.setCnpj(CNPJ);
		empresaRepository.save(empresa);
	}
	
	@After
	public final void tearDown() {
		this.empresaRepository.deleteAll();
	}
	
	@Test
	public void testBuscarEmpresaPorCnpj() {
		Empresa empresa = empresaRepository.findByCnpj(CNPJ);
		if (empresa.getCnpj().contentEquals(CNPJ)) {
			System.out.println("Empresa de CNPJ : " + empresa.getCnpj());
		}
		assertEquals(CNPJ, empresa.getCnpj());
	}
}
