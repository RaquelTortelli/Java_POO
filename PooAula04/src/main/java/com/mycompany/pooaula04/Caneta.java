/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooaula04;

/**
 *
 * @author leona
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    
    public Caneta(String m, String c, float p) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
      
       
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
   
    public void tampar () {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
   public void status() {
       System.out.println("SOBRE A CANETA: ");
       System.out.println("Modelo " + this.getModelo());
       System.out.println("Ponta " + this.getPonta());
       System.out.println("Cor " + this.cor);
       System.out.println("Tampada " + this.tampada);
        
      
   }    
    
       
}
