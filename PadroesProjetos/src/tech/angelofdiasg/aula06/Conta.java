package tech.angelofdiasg.aula06;

public class Conta {
	private int numero;
	private double saldo;

	boolean saque(double val) {
		this.saldo = this.saldo - val; 
		//se o saque aconteceu normalmente retorne return true 
		return true;
	}
	
	boolean deposito(double val) {
		this.saldo = this.saldo + val; 
		//se o saque aconteceu normalmente retorne return true
		return true;
	}

//	void getSaldo(){
//		System.out.println(this.saldo);
//	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
