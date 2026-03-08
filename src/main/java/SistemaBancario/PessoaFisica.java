/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @author Veronica Gomes
 */
public class PessoaFisica extends ClienteBanco{

    private int cpf = 0;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void verifDoc(){
        if (getCpf() < 10 || getCpf() > 20) {
            System.out.println("CPF invalido");
        } else {
            System.out.println("CPF valido");
        }
    }

    @Override
    public void validar() {
        verifDoc();
    }

}
