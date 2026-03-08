/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @author Veronica Gomes
 */
public abstract class ClienteBanco implements Verifica {

    private int numeroConta = 0;
    private String nome = "";
    private Endereco ender = new Endereco();

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return ender;
    }

    public void setNumeroConta(int numeroConta) throws NumException {
        if (numeroConta > 0)
        {
            this.numeroConta = numeroConta;
        } else
        {
            throw new NumException();
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco ender) {
        this.ender = ender;
    }
    
    public abstract void verifDoc() throws NumException;
    
    
}
