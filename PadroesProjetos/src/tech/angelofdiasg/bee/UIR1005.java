package tech.angelofdiasg.bee;
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class UIR1005 {
 
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	double a = leitor.nextDouble();
    	double b = leitor.nextDouble();
    	double peso1 = 3.5;
    	double peso2 = 7.5;
    	
    	double media = ((peso1 * a) + (peso2 * b))/11;
        System.out.printf("MEDIA = %.5f" , media);
 
    }
 
}




