package aula5.conta;


import java.util.Scanner;

public class Aula5Conta {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
      //Nome para conta

int op;
int oc;
int nu;
  ContaPoupanca CP = null;
  ContaCorrente CC = null;
do{      
System.out.println("1.Abrir conta");
System.out.println("2.Sacar");
System.out.println("3.Depositar");
System.out.println("4.Saldo");
System.out.println("5.Sair");

op=input.nextInt(); 

if(op==1){
    
    System.out.println("Qual o tipo de Conta ?\n1.Poupanca\n2.Corrente");
    oc=input.nextInt();
    if(oc==1){
       System.out.println("Digite o numero da conta por gentileza");
       nu=input.nextInt();
       
       CP = new ContaPoupanca();
     }else{
         System.out.println("Digite o numero da conta por gentileza");
         nu=input.nextInt();
         CC = new ContaCorrente(); 
    }
     System.out.println("Conta criada com sucesso!");
    } else if(op==2){
    }else if(op==3){
    }else if(op==4){
        System.out.println("Qual o tipo de Conta ?\n1.Poupanca\n2.Corrente ?");
        oc = input.nextInt();
        if(oc==1){
            System.out.println("Saldo da conta Poupanca e: " + CP.getSaldo());
        }else{
            System.out.println("Saldo da sua conta Corrente e: " + CC.getSaldo());
            }
          }
    }while (op!=5);     
  
    
 } 
}    
   
                  
                   
                 
             
             
                 
      
     
           
        
        
        
        
           
           
        
        
   
      
        
        
        
       
        
    }
    
}
