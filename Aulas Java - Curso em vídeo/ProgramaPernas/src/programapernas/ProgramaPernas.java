/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;
import java.util.Scanner;

/**
 *
 * @author sl_ki
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int pernas = teclado.nextInt();
        String tipo;
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
               tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
            
        }
        System.out.println("O tipo do ser é: " + tipo);
    }

}
