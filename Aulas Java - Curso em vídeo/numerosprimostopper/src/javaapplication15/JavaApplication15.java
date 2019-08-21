/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.Scanner;

/**
 *
 * @author sl_ki
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Por favor digite o número escolhido: ");
       Scanner ler = new Scanner(System.in);
       int numero = ler.nextInt();
       int contador = 0;
       
       for(int j = 1;j <= numero;j++){
           if(contador == 2){
                    System.out.println(j - 1);
                }
           contador = 0;
            for(int i = 1;i <= j;i++){
                if((j % i == 0) && (j % 1 == 0)){
                    contador = contador + 1;
                }
            }
        // TODO code application logic here
    }
    }
}
