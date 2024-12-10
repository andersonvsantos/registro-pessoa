/**
 * @author Estudante
 */
package br.com.anderson.santos;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void dizOla() {
        System.out.println(this.getNome() + " portador do cpf " + this.getCpf() + " disse olá");
    }
}
