
package aula5.conta;

import java.util.Scanner;


public class Conta {
    //atributos
     private final String nome;
    private final int conta; 
     private int saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);
    
    public Conta(String nome, int conta, double saldo_inicial){
        this.nome=nome;
        this.conta=conta;
        saldo=saldo_inicial;
        saques=0;
    }
    
    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");
        
    }
    
    public void sacar(double valor){
        if(saldo >= valor){
            this.getSaldo();
            saldo-=valor;
            saques++;
            System.out.println("Sacado: " + this.getEntrada());
            System.out.println("Novo saldo: " + this.getSaldo() + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
     public void depositar(double valor)
    {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
    
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        }while(opcao <6);
    }
    public String getNome() {
        return nome;
    }

//getters e setters
    public int getConta() {
        return conta;
    }

    public int getSaques() {
        return saques;
    }

    public void setSaques(int saques) {
        this.saques = saques;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
      //  return "Conta{" + "nome=" + nome + "\n, conta=" + conta + "\n, saques=" + saques + "\n, saldo=" + saldo + '}';
    return """
           conta:
                Nome = %s
              Quantidade de saques realizados = %s
                Saldo atual e = %s
                Numero da conta = %s
           """.formatted(this.nome,this.saques,this.saldo,this.conta);
               
    }

    
    public void exibeMenu(){
        
        System.out.println("\t Escolha a opcao desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Saldo");
        System.out.println("5- Status");
        System.out.println("6 - Sair\n");
        System.out.print("Opcao: ");
        
    }
    
    public void escolheOpcao(int opcao){
        double valor;
        
        switch( opcao ){
            case 1:    
                    extrato();
                    break;
            case 2: 
                    
                        System.out.print("Quanto deseja sacar: ");
                         valor = entrada.nextDouble();
                         if(saldo >= valor){
                            saques++;
                           this.setSaldo(this.getSaldo()-valor);
                       } else{
                        System.out.println("Saldo insuficiente");
                         }
                      
                         
                    break;
                   
            case 3:
                    System.out.print("Quanto deseja depositar: ");
                    valor = entrada.nextDouble();
                    depositar(valor);
                    break;
            case 4:
                System.out.println("Seu saldo atual e " + this.getSaldo());
                   break;
            case 5:
                System.out.println(this);
                  break;
            case 6: 
                    System.out.println("Sistema encerrado.");
                    break;
                    
            default:
                    System.out.println("Opção inválida");
        }
    }
}


