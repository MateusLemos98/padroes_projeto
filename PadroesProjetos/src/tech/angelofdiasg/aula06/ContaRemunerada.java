package tech.angelofdiasg.aula06;

public class ContaRemunerada extends Conta{
	
	void aplicaRendimentos (double taxa) {
		deposito(getSaldo() * taxa); 
	}

}
