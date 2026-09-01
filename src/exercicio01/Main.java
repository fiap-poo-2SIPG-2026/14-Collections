package exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("Antonio", 9.8, 21));
        lista.add(new Candidato("Ana", 9.8, 20));
        lista.add(new Candidato("Maria", 9.9, 15));
        lista.add(new Candidato("Patrícia", 10, 10));

        // ordenação
        lista.sort(Comparator.comparing(Candidato::getNotaTecnica)
                .thenComparing(Candidato::getAnosExperiencia).reversed()
                .thenComparing(Candidato::getNome));

        lista.forEach(candidato -> {
            System.out.println(candidato);
        });
    }
}
