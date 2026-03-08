package SistemaBancario;

/**
 *
 * @author Veronica Gomes
 */
public class TstConta {

    public static void main(String[] args) {

        PessoaJuridica empresaUm = new PessoaJuridica();
        PessoaJuridica empresaDois = new PessoaJuridica();
        PessoaJuridica empresaTres = new PessoaJuridica();

        try {
            empresaDois.setCnpj(234443214);
            empresaDois.setNumeroConta(120);
            empresaDois.getResponsavel().setCpf(9);
            empresaDois.getResponsavel().setNome("Juan Carlos Ozorio de Souza Costa de Brito");
            empresaDois.getEndereco().setRua("Quatro");
            
            empresaDois.validar();
        } catch (NumException e) {
            e.impMsg();
        }
        try {
            empresaTres.setCnpj(43425);
            empresaTres.setNumeroConta(12013);
            empresaTres.getResponsavel().setCpf(12);
            empresaTres.getResponsavel().setNome("Veronica");
            empresaTres.getEndereco().setRua("Das Flores");
            
            empresaTres.validar();
        } catch (NumException e) {
            e.impMsg();
        }
        try {
            empresaUm.setCnpj(234443214);
            empresaUm.setNumeroConta(-10);
            empresaUm.getResponsavel().setCpf(15);
            empresaUm.getResponsavel().setNome("Joaquin");
            empresaUm.getEndereco().setRua("mario aspa");
            
            empresaUm.validar();
        } catch (NumException e) {
            e.impMsg();
        }
    }
}
