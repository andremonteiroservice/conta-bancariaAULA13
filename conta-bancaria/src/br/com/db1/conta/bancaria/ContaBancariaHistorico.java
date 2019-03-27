package br.com.db1.conta.bancaria;

import java.time.LocalDateTime;

public class ContaBancariaHistorico {
	private ContaBancariaTipoOperacao tipoOperacao;
	private Double valor;
	private LocalDateTime data;
	
	public ContaBancariaHistorico(ContaBancariaTipoOperacao tipoOperacao, Double valor) {
		this.data = LocalDateTime.now();
		this.tipoOperacao = tipoOperacao;
		this.valor = valor;
	}

}
