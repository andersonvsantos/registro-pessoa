/**
 * @author Estudante
 */
package br.com.anderson.santos;

public class PessoaJuridica extends Pessoa{

    private String cpnj;

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    @Override
    public void dizOla() {
        System.out.println(this.getNome() + " portador do cnpj " + this.getCpnj() + " disse olá");
    }
}
