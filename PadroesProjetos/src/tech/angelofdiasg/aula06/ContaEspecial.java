package tech.angelofdiasg.aula06;

public class ContaEspecial extends Conta{
	private double limite;
	
	boolean saque(double val) {
		setSaldo(getSaldo() - (val * 0.90)); 
		//se o saque aconteceu normalmente retorne return true 
		return true;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
}
