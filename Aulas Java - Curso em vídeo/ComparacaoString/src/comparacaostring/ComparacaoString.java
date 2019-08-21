/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author sl_ki
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "teste";
        String nome2 = "teste";
        String nome3 = new String("teste");
        String res;
        //res = (nome1 == nome2)? "igual":"diferente"; // para variaveis comparar um com o outro(não só o conteudo, mas tudo)
        res = (nome1.equals(nome3))? "igual":"diferente"; // comparar igual(conteudo de objetos) em objetos
        System.out.println(res);
    }
    
}
