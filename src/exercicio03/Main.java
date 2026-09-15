package exercicio03;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<Integer, Aluno> lista = new HashMap<>();

        lista.put(10, new Aluno(10, "Selmini"));
        lista.put(20, new Aluno(20, "Age"));
<<<<<<< HEAD
        lista.put(30, new Aluno(30, "Patrícia"));
        lista.put(10, new Aluno(10, "Selmini"));

        lista.forEach((chave, valor) -> {
            System.out.println(valor);
        });
=======
        lista.put(40, new Aluno(40, "Selmini"));
        lista.put(30, new Aluno(30, "Evelyn"));

        lista.forEach((rm, aluno) -> {
            System.out.println(aluno);
        });

        for(Map.Entry<Integer, Aluno> item : lista.entrySet()) {
            System.out.println("RM: " + item.getKey() + " | " + item.getValue());
        }

>>>>>>> 3aeeeee54d74b4db5320b68cf19b7a5e610258fd
    }
}
