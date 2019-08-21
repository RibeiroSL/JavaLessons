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
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
      //c1.ponta = 0.5f; erro private
        c1.carga = 80;
        //c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
    }
    
}
