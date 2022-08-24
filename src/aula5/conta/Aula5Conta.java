package aula5.conta;


import java.util.Scanner;

public class Aula5Conta {

    public static void main(String[] args) {
     Scanner read = new Scanner (System.in);
      //Nome para conta
        String d;
        System.out.println("Digite um nome para conta");
        d=read.nextLine();
        //Tipo de conta
        String t;
        System.out.println("Digite CC para conta corrente e CP para poupanca.informacao importante na CC voce ganha 50, na CP voce ganha 150 !");
        t=read.nextLine();
       
       //Numero de conta
         int c;
     System.out.println("Digite um numero para conta");
     c=read.nextInt();
     
                 //Criando objeto
          
                  Conta c1 = new Conta();
                  c1.setNumConta(c);
                  c1.setDono(d);
                  c1.setTipo(t);
                  c1.abrirConta(t);
                  c1.estadoAtual();
                  c1.getSaldo();
                  
                  
                  
                 
    
                 
      
     
           
        
        
        
        
           
           
        
        
   
      
        
        
        
       
        
    }
    
}
