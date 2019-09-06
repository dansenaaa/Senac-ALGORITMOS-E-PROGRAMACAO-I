/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.Aula5;

import java.util.Scanner;

/**
 *. Dado um número, verificar se ele é maior que 100. Se for, o algoritmo
deve somar 150 a esse número. No final, imprimir o resultado da soma.
 * 
 * @author daniel.sbastos1
 */
public class MaiorQue100 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um valor :");
        int numero = teclado.nextInt();
        
        if (numero > 100) {
        System.out.println("Numero digitado : " + numero );
         System.out.println( numero + " + 150 : " + (numero + 150));
        } else
        System.out.println("Numero digitado : " + numero);
    }
    
}
