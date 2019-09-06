/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.Aula5;

import java.util.Scanner;

/**
 *
 * Dada a altura e o peso de uma pessoa, determinar seu grau de
obesidade. O grau de obesidade é determinado pelo índice da massa
corpórea (Massa = Peso / Altura2
) através da tabela abaixo:
Massa Corpórea Grau de Obesidade
< 26 Normal
> 26 e < 30 Obeso
> 30 Obeso Mórbido
 * 
 * @author daniel.sbastos1
 */
public class IMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
              float peso,altura;
        System.out.println("Insira seu Peso :");
                     peso = teclado.nextFloat();

             System.out.println("Insira sua altura com VIRGULA :");
             altura= teclado.nextFloat();
             
       float massa =(peso / (altura*altura));
        
        if (massa < 26) 
                    System.out.println(massa +" : Normal");
            else if (massa >= 26 && massa <30) 
                    System.out.println(massa +" : Obeso");
            else{
                                        System.out.println(massa +" : Obeso Mórbido");

            }
        
       
      
    }
    
}
