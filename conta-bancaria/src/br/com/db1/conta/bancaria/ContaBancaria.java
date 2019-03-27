package br.com.db1.conta.bancaria;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
	private String numero;
	private String agencia;
	private Double saldo;
	private ContaBancariaTipo tipo;
	private List<ContaBancariaHistorico> historicos = new ArrayList<>();
	private Cliente cliente;
	
	
	public ContaBancaria(String numero, String agencia, Double saldo, ContaBancariaTipo tipo, Cliente cliente) {
		
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipo = tipo;
		this.cliente = cliente;
	}
	
	
	
	public void sacar(Double valor){
		if (valor > saldo){
			throw new RuntimeException ("Você não possui saldo suficiente");
		}
		this.saldo = this.saldo - valor;
		novoHistorico(ContaBancariaTipoOperacao.SAIDA, valor) ;
		this.historicos.add(historico);
	}
	public Double getSaldo(){
		return this.saldo;
	}
	public List<ContaBancariaHistorico> getHistoricos(){
		return this.historicos;
	}
	
	public void depositar(Double valor){
		if (valor <= 0){
			throw new RuntimeException ("Você não depositou ABSOLUTAMENTE NADA");
		}
		this.saldo = this.saldo + valor;
		novoHistorico(ContaBancariaTipoOperacao.ENTRADA, valor) ;
	}
	private void novoHistorico (ContaBancariaTipoOperacao entrada, double valor){
		ContaBancariaHistorico historico = new ContaBancariaHistorico (null, saldo);
		this.historicos.add(historico);
	}
	public Double getSaldodeposito(){
		return this.saldo;
	}
	public List<ContaBancariaHistorico> getHistoricosdeposito(){
		return this.historicos;
	}



	
	

}