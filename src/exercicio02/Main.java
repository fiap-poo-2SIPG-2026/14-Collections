package exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main() {
<<<<<<< HEAD

        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno(10, "Selmini"));
        lista.add(new Aluno(20, "Israel"));
        lista.add(new Aluno(30, "Age"));
        lista.add(new Aluno(10, "Selmini"));
=======
        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno(10, "Selmini"));
        lista.add(new Aluno(20, "Patrícia"));
        lista.add(new Aluno(10, "Selmini"));
        lista.add(new Aluno(30, "Age"));
>>>>>>> 3aeeeee54d74b4db5320b68cf19b7a5e610258fd

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });

    }
}
