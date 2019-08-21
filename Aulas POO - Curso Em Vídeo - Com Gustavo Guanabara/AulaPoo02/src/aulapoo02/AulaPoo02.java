/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo02;

/**
 *
 * @author sl_ki
 */
public class AulaPoo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Topper";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
        

        
        
// TODO code application logic here
    }
    
}
