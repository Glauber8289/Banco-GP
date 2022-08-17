
package aula5.conta;

import static java.lang.reflect.Array.get;
import static java.nio.file.Paths.get;
import java.util.Scanner;
public class Conta {
    //atributos
    public int NumConta;
    protected String Tipo;
    private String Dono;
    private float Saldo;
    private boolean Status;
    //metodos personalizados
    
    
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
      this.setTipo(t);
      this.setStatus(true);
      if(t == "CC"){
         this.setSaldo(50);
     } else if (t == "CP"){
      this.setSaldo(150);  
    }
        System.out.println("Conta aberta com sucesso !");
    }
     
    public  void fecharConta(){
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
               System.out.println("Saque realizado na com de" + this.getDono());
            } else {
               System.out.println("Saldo insuficiente para saque");
           }
       } else {
           System.out.println("Impossivel sacar de uma conta fechada");
       }
    }
    public void pagarMensal (){
        int v = 0;
        if (this.getTipo()== "CC"){
            v = 12;
        } else if (this.getTipo()== "CP") {
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
    public void Conta(){
    this.Saldo = 0;
    this.Status = false;
    }       
     public void Receber (){
     //Nome da conta
     Scanner read = new Scanner (System.in);
     String Dono;
     System.out.println("Digite um nome para conta");
     Dono=read.nextLine();
     //Tipo da conta 
     String Tipo;
        System.out.println("Digite CC para conta conrrente e CP para poupanca."
                + "informacao importante se na CC voce ganha 50, na CP voce ganha 150");
      Tipo= read.nextLine();
     
     
     
     }

}