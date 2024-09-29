package aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono; 
    private float saldo;
    private boolean status;
    public void estadoAtual(){
         System.out.println("______________________________");
         System.out.println("Conta:" + this.getNumConta());
         System.out.println("Tipo:" + this.tipo);
         System.out.println("Dono:" + this.getDono());
         System.out.println("Saldo:" + this.getSaldo());
         System.out.println("Status:" + this.getStatus());
    }
    //Métodos
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")){
            this.setSaldo(50);
        } else if (t .equals("CP")); {
            this.setSaldo(150);
        }  
        System.out.println("Conta aberta com sucesso.");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro, não pode ser fechada.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito, não pode ser fechada.");
        } else {
            this.setStatus(false);
        }
    }         
    public void depositar(float v) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);      
            System.out.println("Depósito realizado na conta de" + this.getDono());
        } else {
            System.out.println("Impossível depositar");
        }
    }        
    public void sacar(float v) {
       if (this.getStatus()) {
          if (this.getSaldo() >= v) {
              this.setSaldo(this.getSaldo() - v);
              System.out.println("Saque realizado na conta de" + this.getDono());
       } else {
              System.out.println("Saldo insuficiente");   
          }  
      } else {
             System.out.println("Impossível sacar de uma conta fechada");
       }      
    }        
    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
    } else if ("CP".equals(this.getTipo())) {
            v = 20;
    }
    if (this.getStatus()){
       this.setSaldo(this.getSaldo() - v);
        System.out.println("Mensalidade paga com sucesso por" + this.getDono());
    } else {
        System.out.println("Impossível pagar uma conta fechada");
    }
        
   
   }        
    
    //Métodos Especiais

    public ContaBanco() {
        this.saldo=0;
        this.status=false;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }
    
    
    
    
    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
}

