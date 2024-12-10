/**
 * @author Estudante
 */
package br.com.anderson.santos;

public abstract class Pessoa {

    private long codigo;

    private String nome;

    public abstract void dizOla();

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
