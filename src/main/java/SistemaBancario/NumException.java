/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @author Veronica Gomes
 */
public class NumException extends Exception{

    public void impMsg() {
        System.out.println("ERRO: Nao pode haver Numero Negativo para conta!");
    }
}
