package exercicio02;

import java.util.Objects;

public class Aluno {
    private int rm;
    private String nome;

    public Aluno(int rm, String nome) {
        this.rm = rm;
        this.nome = nome;
    }

    @Override
<<<<<<< HEAD
    public String toString() {
        return rm + "  |  " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return rm == aluno.rm;
=======
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return rm == aluno.rm && Objects.equals(nome, aluno.nome);
>>>>>>> 3aeeeee54d74b4db5320b68cf19b7a5e610258fd
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        return Objects.hashCode(rm);
=======
        return Objects.hash(rm, nome);
    }

    @Override
    public String toString() {
        return rm + " | " + nome;
>>>>>>> 3aeeeee54d74b4db5320b68cf19b7a5e610258fd
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
