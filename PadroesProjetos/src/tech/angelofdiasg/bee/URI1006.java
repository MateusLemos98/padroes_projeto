package tech.angelofdiasg.bee;
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1006 {
 
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	double a = leitor.nextDouble();
    	double b = leitor.nextDouble();
    	double c = leitor.nextDouble();
    	
    	double media = ((a*2) + (b * 3) + (c * 5)) / 10;
    	
    	System.out.println(String.format("MEDIA = %.1f", media));
    	
    	
 
    }
  
}



