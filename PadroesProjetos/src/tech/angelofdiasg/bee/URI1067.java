package tech.angelofdiasg.bee;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1067 {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        
        for (int i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		} 
    }
 
}







