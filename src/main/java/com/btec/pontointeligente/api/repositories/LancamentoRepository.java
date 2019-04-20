package com.btec.pontointeligente.api.repositories;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.btec.pontointeligente.api.entities.Lancamento;

@Transactional(readOnly = true)
@NamedQueries({
	@NamedQuery(name = "LancamentoRepository.findByFuncionarioId",
			query = "SELECT lanc FROM  Lancamento lanc WHERE lanc.funcionario.id = :funcionarioID")})
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	
	List<Lancamento> findByFuncionarioId(@Param("funcionarioID") Long funcionarioId);

	Page<Lancamento> findByFuncionarioId(@Param("funcionarioID") Long funcionarioId, Pageable pagaPageable);
	
	/**
	 * Usando JPQL
	 * @author FROES
	 * @Param primeiroNome
	 * @Return lista de lancamentos que os funcionarios possuem o primeiro nome igual ao informado
	 * 
	 */
	
	@Query("SELECT c FROM Lancamento c WHERE c.funcionario.nome like ?1%")
	public List<Lancamento> findAllByfirstName(String pPrimeiroNome);
}
