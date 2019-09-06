/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.Aula5;

import java.util.Scanner;

/**
 *
 * Dados dois números, verificar se a divisão do primeiro número pelo
segundo é exata (o resto da divisão deve ser igual a 0). Se for, o
algoritmo deve imprimir a mensagem “A divisão de (número 1) por
(número 2) é exata”.
 * 
 * @author daniel.sbastos1
 */
public class Divisao {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira 1° valor :");
            int numero = teclado.nextInt();
            
            System.out.println("Insira 2° valor :");
            int numero1 = teclado.nextInt();
            
            if (numero % numero1 == 0) 
                System.out.println("A divisão de "+ numero +" por " + numero1 + " é exata");
         else 
          System.out.println("A divisão de "+ numero +" por " + numero1 + " tem resto : " + (numero % numero1 ) );
                
    }
    
}
