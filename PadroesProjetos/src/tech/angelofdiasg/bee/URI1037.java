package tech.angelofdiasg.bee;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI1037 {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();
        
//  O símbolo ( representa "maior que". Por exemplo:
// [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
// (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
        if( valor >= 0 && valor <= 25) {
        	System.out.println("Intervalo [0,25]");
        } else if(valor > 25 && valor <= 50) {
        	System.out.println("Intervalo [25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75,100]");
        } 
        // Obviamente se o valor não estiver em nenhum destes intervalos, 
//        deverá ser impressa a mensagem “Fora de intervalo”.
        else {
        	System.out.println("Fora de intervalo");
        }
    }
}









