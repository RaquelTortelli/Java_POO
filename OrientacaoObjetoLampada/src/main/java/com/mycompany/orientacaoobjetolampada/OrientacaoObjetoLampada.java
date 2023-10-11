/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.orientacaoobjetolampada;

/**
 *
 * @author leona
 */
public class OrientacaoObjetoLampada {

    public static void main(String[] args) {
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
