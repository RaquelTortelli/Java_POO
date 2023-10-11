/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.orientacaoobjetocontacorrente;

/**
 *
 * @author leona
 */
public class OrientacaoObjetoContaCorrente {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente ();
        
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        
        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
    }
}
