package com.crivelaro.inteligente.api.services;

import java.util.Optional;

import com.crivelaro.inteligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna uma Empresa dado um CNPJ
	 * 
	 * @param cnpj
	 * @return
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova Empresa na base de dados
	 * @param empresa
	 * @return
	 */
	Empresa persistir(Empresa empresa);
}
