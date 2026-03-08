/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBancario;

/**
 *
 * @author Veronica Gomes
 */
public class PessoaJuridica extends ClienteBanco {

    private int cnpj = 0;
    private PessoaFisica responsavel = new PessoaFisica();

    public int getCnpj() {
        return cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public void verifDoc() {
        if (getResponsavel().getNome().length() > 30) {
            System.out.println("Nome invalido para responsavel");
        }
        else{
            System.out.println("Nome valido para responsavel");
        }
    }

    @Override
    public void validar() {
        System.out.println("Validando o cliente: " + getResponsavel().getNome());
        System.out.println(getNumeroConta());
            if (getNumeroConta() % 2 != 0){
                System.out.println("O numero da conta e impar");
            }
            else {
                System.out.println("O numero da conta e par");
            }
            System.out.println(getResponsavel().getCpf());
            getResponsavel().validar();
            System.out.println(getResponsavel().getNome());
        verifDoc();
    }
}
