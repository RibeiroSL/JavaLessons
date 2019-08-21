/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrepita;
import javax.swing.JOptionPane;

/**
 *
 * @author sl_ki
 */
public class Exrepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = -1;
        int total = 0;
        int par = 0;
        int impar = 0;
        int acima = 0;
        int media = 0;
        do{
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número. O valor 0 interrompe o programa."));            
            num = n;
            if(n != 0){
            
            total++;
            if(num % 2 == 0){
                par++;
            }else if(n != 0){impar++;}
            if(num > 100){
                acima++;
            }
            media += num;
            }
        }while(num != 0);
                    JOptionPane.showMessageDialog(null, "<html>O total de números digitados é: " + total + "<br>" +
                    "Números pares: " + par + "<br>" +
                    "Numeros Ímpares: " + impar + "<br>" +
                    "Numeros acima de 100: " + acima + "<br>" + 
                    "Média: " + (media / total) + "</html>", "Resultado", JOptionPane.INFORMATION_MESSAGE /* nome da janela, mensagem na janela, cabeçalho da janela, icone*/ );
    }
    
}
