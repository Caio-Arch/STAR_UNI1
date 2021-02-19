
package exercicios_staruni;

import java.util.Scanner;


public class Multiplicar {
    public static void main(String[] args){
        int valor;
        int valor2;
        
        Scanner n = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        valor = n.nextInt();
        System.out.println("Digite o segundo Valor");
        valor2 = n.nextInt();
        System.out.println("Multiplicando: " +valor);
        System.out.println("Ínicio do Intervalo: " +valor2);
        System.out.println("Fim do Intervalo: ");
       
        if(valor >= 3000 || valor<0){
            System.out.println("Valor Invalidoo");
            
        }
        else if(valor2 >= 3000 || valor2 < 0){
            System.out.println("Valor Invalido");
        }
        else {
         for(valor2=12; valor2<=17;valor2++){
            int mult = valor *valor2 ;
           
            System.out.println(valor + " x " +valor2 + " = " + mult);
          }
         
        }
    }
}
