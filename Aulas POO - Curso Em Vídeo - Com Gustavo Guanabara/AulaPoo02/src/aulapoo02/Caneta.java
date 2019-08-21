package aulapoo02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        
        System.out.print("Uma caneta " + this.cor + " "); //this é uma referencia ao proprio objeto (no caso c1).
        System.out.print("do modelo " + this.modelo);
        System.out.print(", ponta " + this.ponta + " ");
        System.out.print("e " + this.carga + "% " + "de carga ");
        System.out.println("está tampada?  " + this.tampada);
    }
    
    void rabiscar(){

        if (this.tampada == true){
            
            System.out.println("ERRO! Não posso rabiscar");
        
        }
        else{
            
            System.out.println("Estou Rabiscando");
            
        }
    }
    
    void tampar(){
        
        this.tampada = true;
        
    }
    void destampar(){
        
        this.tampada = false;
        
    }
}
