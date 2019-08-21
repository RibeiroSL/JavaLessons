/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos2;

import java.util.Scanner;

/**
 *
 * @author sl_ki
 */
public class ScannerTeste {
            
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota de" + nome);
        float nota = teclado.nextFloat();
        System.out.println("Digite um inteiro a ser mostrado no final deste programa");
        int teste = teclado.nextInt();
        System.out.println("Digite um boolean a ser mostrado no final deste programa");
        boolean testeboolean = teclado.nextBoolean();
        
        System.out.println("nome: " + nome);
        System.out.println("nota: " + nota);
        System.out.println("inteiro: " + teste);
        System.out.println("boolean: " + testeboolean);
}

}