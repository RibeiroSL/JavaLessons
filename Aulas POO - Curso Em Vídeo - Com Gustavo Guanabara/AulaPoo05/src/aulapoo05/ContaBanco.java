package aulapoo05;

public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;              //aceita apenas os valores "CC" e "CP"
    private String dono;
    private float saldo;
    private boolean status;
    //metodos
    public void abrirConta(String t){
        if(t.equals("CC") || t.equals("CP")){                                                                                                                                     //alt + 124
            this.setTipo(t);
            this.setStatus(true);
        }else{System.out.println("Tipo de conta inválido. \n "
                + "Tipos válidos: \n "
                + "CC para conta corrente. \n "
                + "CP para conta puopança. \n");
        }
        if(t.equals("CC")){
            this.setSaldo(50.00f);
        }else  if(t.equals("CP")){
            this.setSaldo(150.00f);
               }
    }
    public void fecharConta(){
    if(this.getSaldo() == 0f){
        this.setStatus(false);
    }else{System.out.println("Erro ao fechar a conta. \n"
            + "O saldo da conta não está zerado.\n" + 
            "Por favor, zere o saldo e tente novamente.\n");
        }
}
    public void depositar(float v){
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo() + v);
        }else{System.out.println("Erro. A conta ainda não está ativa.");}
    }
    public void sacar(float q){
        if(q <= this.getSaldo() && this.isStatus() == true){
            this.setSaldo(this.getSaldo() - q); 
        }else{System.out.println("Saldo insuficiente.");}
    }
    public void pagarMensal(){
        if(this.getTipo().equals("CC") && this.isStatus()){
            this.setSaldo(getSaldo() - 12.00f);
        }else if(getTipo().equals("CP") && this.isStatus()){
                    this.setSaldo(getSaldo() - 20.00f);
        }
        else{System.out.println("Erro no pagamento mensal. Tipo de conta invalido.");}
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void ContaBanco() {
        this.saldo = 0f;
        this.status = false;
    }
    
    public void mostrarTudo(){                                                   //teste pessoal para conferir os valores.
        
        System.out.println("numConta = " + getNumConta());
        System.out.println("tipo = " + getTipo());
        System.out.println("dono = " + getDono());
        System.out.println("saldo = " + getSaldo());
        System.out.println("status = " + isStatus() + "\n");
    }
    
    
    
}
