package exercicio02;

import java.util.*;

public class GerenciadorDeMatricula {
    static void main() {
        // lista dos alunos matriculados em banco de dados
        Set<Aluno> listaBanco = new HashSet<>();
        listaBanco.add(new Aluno(10, "A"));
        listaBanco.add(new Aluno(20, "B"));
        listaBanco.add(new Aluno(10, "A"));
        listaBanco.add(new Aluno(30, "C"));

        // lista dos alunos matriculados em estrutura de dados
        Set<Aluno> listaEstrutura = new HashSet<>();
        listaEstrutura.add(new Aluno(20, "B"));
        listaEstrutura.add(new Aluno(40, "D"));
        listaEstrutura.add(new Aluno(50, "F"));

        // lista dos alunos matriculados em banco OU estrutura
        System.out.println("Alunos matriculados em banco OU estrutura");
        Set<Aluno> todos = new HashSet<>(listaBanco);
        todos.addAll(listaEstrutura);
        todos.forEach(aluno -> System.out.println(aluno));

        // lista dos alunos matriculados em banco E estrutura
        System.out.println("\nAlunos matriculados em banco E estrutura");
        Set<Aluno> mesmo = new HashSet<>(listaBanco);
        mesmo.retainAll(listaEstrutura);
        mesmo.forEach(aluno -> System.out.println(aluno));

        // lista dos alunos matriculados APENAS em estrutura
        System.out.println("\nAlunos matriculados APENAS em estrutura");
        Set<Aluno> sohEstrutura = new HashSet<>(listaEstrutura);
        sohEstrutura.removeAll(listaBanco);
        List<Aluno> lista = new ArrayList<>(sohEstrutura);
        lista.sort(Comparator.comparing(Aluno::getNome));
        lista.forEach(System.out::println);

    }
}
