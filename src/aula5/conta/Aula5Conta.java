package aula5.conta;


import java.util.Scanner;

public class Aula5Conta {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
      //Nome para conta

int op;
 int oc;
  ContaPoupanca CP = null;
  ContaCorrente CC = null;
do{      
System.out.println("1.Abrir conta");
System.out.println("2.Sacar");
System.out.println("3.Depositar");
System.out.println("4.Saldo");
System.out.println("5.Sair");

op=input.nextInt(); 

         switch (op) {
             case 1 -> {
                 System.out.println("Qual o tipo de Conta ?\n1.Poupanca\n2.Corrente");
                 oc=input.nextInt();
                 if(oc==1){
                     CP = new ContaPoupanca();
                 }else{
                     CC = new ContaCorrente();
                 }            System.out.println("Conta criada com sucesso!");
             }
             case 2 -> {
             }
             case 3 -> {
             }
             case 4 -> {
                 System.out.println("Qual o tipo de Conta ?\n1.Poupanca\n2.Corrente ?");
                 oc = input.nextInt();
                 if(oc==1){
                     System.out.println("Saldo da conta Poupanca e: " + CP.getSaldo());
                 }else{
                     System.out.println("Saldo da sua conta Corrente e: " + CC.getSaldo());
                 }
             }
             default -> {
             }
         }
    }while (op!=5);     
  
    
 } 
}    
   
                  
                   
                 
             
             
                 
      
     
           
        
        
        
        
           
           
        
        
   
      
        
        
        
       
        
    }
    
}
