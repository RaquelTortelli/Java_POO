/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orientacaoobjeto;

/**
 *
 * @author leona
 */
public class Exer01 {
    public static void main(String[] arg) {
        
        Lampada lampada = new Lampada();
        
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        
        lampada.tipos = new String[5];
        lampada.tipos[0] = "Anajur";
        lampada.tipos[1]="Lampeões";
        
        
        
        System.out.println(lampada.cor);
     
    }
}
