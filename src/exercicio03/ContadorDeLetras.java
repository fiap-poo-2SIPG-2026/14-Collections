package exercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDeLetras {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> total = new HashMap<>();
        String frase;
        char letra;

        System.out.print("Frase --> ");
        frase = sc.nextLine().toLowerCase();

        for(int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            if(Character.isLetter(letra)) {
                if(total.containsKey(letra)) {
                    total.put(letra, total.get(letra) + 1);
                }
                else {
                    total.put(letra, 1);
                }
            }
        }

        total.forEach((character, valor) -> {
            System.out.println(character + "  |  " + valor);
        });

    }
}
