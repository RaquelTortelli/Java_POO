/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooaula02;

/**
 *
 * @author leona
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }
    
    void rabiscar () {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar ");
        } else { 
            System.out.println("Estou Rabiscando");
        }
    }
    
    void tampar () {
       this.tampada = true;  //é uma referencia ao objeto que chamou
    }
    
    void destampar() {
       this.tampada = false; 
    }
}
