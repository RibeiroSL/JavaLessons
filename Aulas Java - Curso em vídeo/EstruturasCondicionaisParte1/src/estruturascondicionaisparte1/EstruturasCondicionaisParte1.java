/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturascondicionaisparte1;
import java.util.Scanner;

/**
 *
 * @author sl_ki
 */
public class EstruturasCondicionaisParte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float n1,n2;
        Scanner teclado = new Scanner(System.in);
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        float m = (n1 + n2) / 2;
        System.out.println(m);
        if(m >= 9 ){
            System.out.println("Parabéns!");
            
        }
    }
    
}
