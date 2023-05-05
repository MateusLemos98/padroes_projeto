package aula03;

public class Conta {
	   int numero;
	   String nome;
	   double saldo;
	   double limite;

	   public Conta(int numero, String nome, double saldo,
			   double limite) {
		   this.numero = numero;
		   this.nome = nome;
		   this.saldo = saldo;
		   this.limite = limite;
		   
	   }	    
	    
		public Conta() {
	    	System.out.println("Conta criada!");
	    }

		   void saca(double quantidade) {
			      double novoSaldo = this.saldo - quantidade;
			      this.saldo = novoSaldo;
			   }
		   
}
