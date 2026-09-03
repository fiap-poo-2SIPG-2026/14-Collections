package exercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDeLetras {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> contador = new HashMap<>();
        String frase;
        char letra;

        System.out.print("Frase --> ");
        frase = sc.nextLine();

        for(int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            if(Character.isLetter(letra)) {

            }
        }

    }
}
