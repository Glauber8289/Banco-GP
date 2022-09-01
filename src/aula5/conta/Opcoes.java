
package aula5.conta;


public class Opcoes extends Conta  {
  
    public void saldo(){
        super.getSaldo();
        super.setSaldo(Saldo);
    }
           int o;
            System.out.println("Digite 1 para ver o saldo, 2 para ver sacar, 3 para depositar ");
            o=read.nextInt();
                           
               switch (o){
                   case 1:
                       System.out.println("Seu saldo atual e " + super.getSaldo);
                       
                       
                 }    
                               
              
}
