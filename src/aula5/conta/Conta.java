
package aula5.conta;


public class Conta {
    //atributos
    public int NumConta;
    public String Tipo;
    private String Dono;
    public float Saldo;
    private boolean Status;
    //metodos personalizados
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Parabens sua conta foi criada com sucesso!!!");
        System.out.println("Conta  " + this.getNumConta());
        System.out.println("Tipo de Conta " + this.getTipo());
        System.out.println("Dono " + this.getDono());
         System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }
    
//Criando metodos getters e setters para os atributos
    public void setNumConta(int n){
        this.NumConta=n;
    }
    public int getNumConta(){
        return this.NumConta;
     }
    public void setTipo(String t){
        this.Tipo=t;
    }
    public String getTipo(){
        return this.Tipo;
    }
    public void setSaldo(float s){
        this.Saldo=s;
    }
    public float getSaldo(){
        return this.Saldo;
    }
   
       public void setStatus(boolean e){
        this.Status=e;
    }
    public boolean getStatus(){
        return this.Status;
    }
    
         public void setDono(String d){
        this.Dono=d;
    }
    public String getDono(){
        return this.Dono;
    }
    
    
    public void abrirConta(String t){
        this.getTipo();
        this.setStatus(true);
        if("CC".equals(t)){
         this.setSaldo(50);
      } else if ("CP".equals(t)){
          this.setSaldo(150);
     
        System.out.println("Conta aberta com sucesso !");
    }
    }     
    public void fecharConta(){
    if (this.getSaldo() > 0) {
        System.out.println("Conta não pode ser fechada pois temos debitos a serem utilizados");
    }  else if (this.getSaldo () < 0){
        System.out.println("Não podemos fechar a conta pois voce possui debitos pendentes");
    }  else {
        this.setStatus(false);
        System.out.println("Conta fechada com sucessso!");
      }
    }
    public void depositar (float v){
        if(this.getStatus()) {
        this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta do" + this.getDono()); 
       } else {
            System.out.println("Impossivel depositar conta inexistente");
        }
    }
    public void sacar(float v){
       if (this.getStatus()) {
           if (this.getSaldo() >= v){
               this.setSaldo(this.getSaldo() -v);
               System.out.println("Saque realizado na conta de" + this.getDono());
            } else {
               System.out.println("Saldo insuficiente para saque");
           }
       } else {
           System.out.println("Impossivel sacar de uma conta fechada");
       }
    }
    public void pagarMensal (){
        int v = 0;
        if ("CC".equals(this.getTipo())){
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
           } 
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v) ;
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
            } else { 
            System.out.println("Impossivel pagar uma conta inexistente");
        }
    }
     //metodo construtor
    public Conta(){
        this.Saldo=0;
        this.Status=false;
    
    
    }       
     
     
     }

