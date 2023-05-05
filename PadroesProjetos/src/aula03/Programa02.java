package aula03;

public class Programa02 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.nome ="Angelo";
		c1.limite = 1000.0;
		c1.numero = 1;
		c1.saldo = 100;
		
		c1.saca(10);
		
		Conta c2 = new Conta(2, "Dias", 200, 2000);
		
		c2.saca(20);
		
		System.out.println("Saldo da Conta C1: " + c1.saldo);
		
		System.out.println("Saldo da Conta C2: " + c2.saldo);
	}

}




