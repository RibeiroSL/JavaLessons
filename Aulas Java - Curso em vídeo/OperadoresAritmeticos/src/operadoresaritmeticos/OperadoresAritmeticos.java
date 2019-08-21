/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;


import java.util.Scanner;
/**
 *
 * @author sl_ki
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* - calcular media:
        Scanner receber = new Scanner(System.in);
        int n1 = receber.nextInt();
        int n2 = receber.nextInt();
        int media = (n1 + n2) /2;
        
        
        System.out.println("A média é: " + media);
        */
        
        /*
            int numero = 5;
            numero++;
            System.out.println(numero);
        */
        /*
        int x = 4;
        x += 2;
        System.out.println(x);*/
        
        //Calcular um numero aleatorio entre 5 e 10:
        //(menor numero + random * (intervalo entre os numeros)
        
        double v = Math.random();
        int numero = (int) (5 + v * (10 - 5));
        System.out.println(numero);
    }
    
}
