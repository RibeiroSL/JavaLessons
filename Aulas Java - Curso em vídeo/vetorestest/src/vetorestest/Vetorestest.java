/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorestest;
import java.util.Scanner;

/**
 *
 * @author sl_ki
 */
public class Vetorestest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = new int[4];
        Scanner s = new Scanner(System.in);
        
        for(int i = 0;i < 4;i++){
            int valor = (int) s.nextInt();
            n[i] = valor;
        }
        for(int valor: n){
            System.out.println(valor);
        }
    }
    
}
