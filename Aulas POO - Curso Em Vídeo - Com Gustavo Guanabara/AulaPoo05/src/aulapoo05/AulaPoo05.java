package aulapoo05;

public class AulaPoo05 {

    public static void main(String[] args) {
        //requisitos do problema
        ContaBanco Jubileu = new ContaBanco();
        Jubileu.abrirConta("CP");
        Jubileu.depositar(300.00f);
        
        //testando os valores dos atributos restantes
        Jubileu.setNumConta(123456);
        Jubileu.setDono("Jubileu");
        Jubileu.mostrarTudo();
        
        
        //requisitos do problema
        ContaBanco Creuza = new ContaBanco();
        Creuza.abrirConta("CC");
        Creuza.depositar(500.00f);
        Creuza.sacar(100.00f);
        
        //testando os valores dos atributos restantes
        Creuza.setNumConta(45753);
        Creuza.setDono("Jubileu");
        Creuza.mostrarTudo();
    }
    
}
