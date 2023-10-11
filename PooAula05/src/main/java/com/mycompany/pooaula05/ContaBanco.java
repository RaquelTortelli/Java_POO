/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooaula05;

/**
 *
 * @author leona
 */
public class ContaBanco {
  
   //Atributos
   public int numConta;
   protected String tipoConta;
   private String dono;
   private float saldo;
   private  boolean statusConta;
   
   //Métodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.statusConta = false;
    }
           
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
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

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    
   
    //Métodos Personalizados 
     public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo da conta " + this.getTipoConta());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatusConta());
    }        
       
    public void abrirConta(String t) {
        this.setTipoConta(t);
        this.setStatusConta(true);
        if ("CC".equals(t)) {
           this.setSaldo(50);
       } else if ("CP".equals(t)){
          this.setSaldo(150);
       }
        System.out.println("Conta aberta com sucesso!");
    }        
    
    public void fecharConta() {
       if (this.getSaldo() > 0) {
           System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
       } else if (this.getSaldo() < 0) {
           System.out.println("Conta não pode ser fechada pois ainda tem débito.");
       } else {
            System.out.println("Conta fechada com sucesso!");
       }
                    
   }   
    public void depositar (float v) {
       if(this.getStatusConta()) {   
           this.setSaldo(this.getSaldo() + v);
           System.out.println("Depósito realizado na conta de " + this.getDono());
            
       } else { 
           System.out.println("Impossível depositar em uma conta fechada.");
       }
       
   }   
    public void sacar(float v) {
       if (this.getStatusConta()) {
           if(this.getSaldo() >= v) {
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saque realizado na conta de " +this.getDono());
           } else {
               System.out.println("Saldo insuficiente para saque. ");
           }    
       } else {
           System.out.println("Impossível sacar na conta fechada. ");
       }
   }   
   public void pagarMensal() {
       int v = 0;
       if (this.getTipoConta() == "CC") {
           v = 12;
       } else if (this.getTipoConta() == "CP") {
           v = 20;
       }
       if (this.getStatusConta()) {
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Mensalidade paga com sucesso por " + this.getDono());
       } else {
           System.out.println("Impossível pagar uma conta fchada. ");
       }
   }
}
