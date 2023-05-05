package tech.angelofdiasg.aula06;

public class App {

	public static void main(String[] args) {
		ContaRemunerada conta1 = new ContaRemunerada();
	    System.out.println("Saldo inicial = " + conta1.getSaldo());
	    conta1.deposito(100.00);
	    conta1.aplicaRendimentos(0.005);
	    System.out.println("Novo saldo = " + conta1.getSaldo());
	    
	    ContaEspecial contaEsp = new ContaEspecial();
	    contaEsp.deposito(100.00);
	    System.out.println("Saldo de 3 meses = " + contaEsp.getSaldo());
	    contaEsp.setLimite(1000.00);
	    System.out.println("Limite do chorão = " + contaEsp.getLimite());

	}

}
