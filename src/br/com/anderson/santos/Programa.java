/**
 * @author Estudante
 */
package br.com.anderson.santos;

public class Programa {

    public static void main(String args[]) {

        PessoaFisica pf = new PessoaFisica();

        pf.setCodigo(1);
        pf.setNome("Anderson");
        pf.setCpf("123.123.123-12");
        pf.dizOla();

        PessoaJuridica pj = new PessoaJuridica();

        pj.setCodigo(2);
        pj.setNome("Empresa teste");
        pj.setCpnj("99.999.999/0001-99");
        pj.dizOla();
    }

}
