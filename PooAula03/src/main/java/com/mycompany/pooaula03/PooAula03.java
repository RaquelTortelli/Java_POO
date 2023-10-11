/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooaula03;

/**
 *
 * @author leona
 */
public class PooAula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; privado
        c1.carga = 80;
        //c1.tampada = true;
        c1.destampar();
        c1.status();              
        
    }
}
