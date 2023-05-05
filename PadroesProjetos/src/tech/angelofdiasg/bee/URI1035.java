package tech.angelofdiasg.bee;

import java.io.IOException;
import java.util.Scanner;

public class URI1035 {

	public static void main(String[] args) throws IOException {
//		ENTRADAS: Quatro números inteiros A, B, C e D.

		int a, b, c, d;
		
	Scanner leitor = new Scanner(System.in);
	a = leitor.nextInt();
	b = leitor.nextInt();
	c = leitor.nextInt();
	d = leitor.nextInt();

	//	A seguir, se B for maior do que C e se D for maior do que A,
//	e a soma de C com D for maior que a soma de A e B e se C e D,
//	ambos, forem positivos e se a variável A for par 
//	escrever a mensagem "Valores aceitos"
	
	if(b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
        System.out.println("Valores aceitos"); 
	} else {
        System.out.println("Valores nao aceitos"); 
	}

	}

}











