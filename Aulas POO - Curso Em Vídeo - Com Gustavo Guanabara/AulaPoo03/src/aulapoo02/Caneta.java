package aulapoo02;

public class Caneta {
    public String modelo;
    String cor; //public para pacote (visibilidade default java)
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    void status(){
        
        System.out.print("Uma caneta " + this.cor + " "); //this é uma referencia ao proprio objeto (no caso c1).
        System.out.print("do modelo " + this.modelo);
        System.out.print(", ponta " + this.ponta + " ");
        System.out.print("e " + this.carga + "% " + "de carga ");
        System.out.println("está tampada?  " + this.tampada);
    }
    
   public void rabiscar(){

        if (this.tampada == true){
            
            System.out.println("ERRO! Não posso rabiscar");
        
        }
        else{
            
            System.out.println("Estou Rabiscando");
            
        }
    }
    
    public void tampar(){
        
        this.tampada = true;
        
    }
    public void destampar(){
        
        this.tampada = false;
        
    }
}
