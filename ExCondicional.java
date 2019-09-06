/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.Aula5;

import java.util.Scanner;

/**
 *
 * @author daniel.sbastos1
 */
public class ExCondicional {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira 3 valores :");
        int n1,n2,n3 ;
        
         n1 = teclado.nextInt();
         n2 = teclado.nextInt();
         n3 = teclado.nextInt();
         
         if ((n1 > n2) && (n2 > n3)) {
             System.out.println("Maior numero: " + n1);
        } else if ((n2 > n1) && (n2 > n3)){
                         System.out.println("Maior numero: " + n2);

            
        }else{
                         System.out.println("Maior numero: " + n3);

        }

    }
    
}
