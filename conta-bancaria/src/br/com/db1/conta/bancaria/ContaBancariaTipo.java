package br.com.db1.conta.bancaria;

public enum ContaBancariaTipo {
	//POUPANCA, CORRENTE;
	
	POUPANCA("0013"), CORRENTE("0001");
	  private String numero;
	  
	  private ContaBancariaTipo(String numero){
	  this.numero = numero;
	  }
	  public String getNumero(){
	  return this.numero;
	  }
	 
}
