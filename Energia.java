/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.Aula5;

import java.util.Scanner;

/**
 *
 * Calcular a conta de consumo de energia elétrica de um consumidor, dado
o kWh consumido, de acordo com a tabela abaixo:
KW Consumido Valor do kWh
< 150 kWh R$ 0,20
> 150 e < 500 R$ 0,25
> 500 R$ 0,30
Valor mínimo da conta R$ 11,90
 * 
 * @author daniel.sbastos1
 */
public class Energia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor de kWh consumido");
            float consumo = teclado.nextFloat();
            float valor;
            final float VALOR_MINIMO =(float)11.90;
            
            if (consumo < 150){
            valor = consumo * 0.20f ;
                       
            }else if(consumo >= 150 && consumo <500 ){
                    valor = consumo * 0.25f ;
            }else{
                  valor = consumo * 0.30f ;
            }
             
               if (valor <= VALOR_MINIMO) {
                    valor =VALOR_MINIMO;
                }
            System.out.println("valor da conta final : " + valor);
        
        
    }
}
