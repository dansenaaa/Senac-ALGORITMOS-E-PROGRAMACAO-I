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
public class AprovacaoAlgoritmo {
    public static void main(String[] args) {
        
    
       Scanner teclado = new Scanner(System.in);
       String nomeAluno;
       int faltas;
       float prova1,prova2,n1,n2,media ;   
       final float P1 = (float) 0.4 ;
       final float P2 = (float) 0.6 ;
       final int TOTAL_FALTAS = 18 ;
     
        System.out.println("--------------------------------------------");
        System.out.println("Aluno : ");
        nomeAluno = teclado.next();
         System.out.println("Prova 1 : ");
        prova1 = teclado.nextFloat();
         System.out.println("Prova 2: ");
        prova2 = teclado.nextFloat();
        System.out.println("numero de faltas : ");
        faltas = teclado.nextInt();
        
        n1 = prova1 * P1;
        n2 = prova2 * P2;

        media = n1+n2;
        
        if (media >= 6 && faltas <= TOTAL_FALTAS){
            System.out.println(nomeAluno + "- Aprovado : " + media);
            System.out.println("faltas : " + faltas);
        }else if(media < 6 && faltas >= TOTAL_FALTAS){ 
                    System.out.println(nomeAluno +" - Reprovado pela media e faltas: ");
                    System.out.println("media : " + media);
                    System.out.println("faltas " + faltas);
        }else if(media < 6 ){
            System.out.println(nomeAluno +" - Reprovado pela media e faltas: ");
                    System.out.println("media : " + media);
                    System.out.println("faltas " + faltas);
            
        }else{
                System.out.println(nomeAluno +" - Reprovado pela faltas: ");
                    System.out.println("media : " + media);
                    System.out.println("faltas " + faltas);
        }
       

    }
       
}
