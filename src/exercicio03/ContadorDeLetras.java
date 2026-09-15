package exercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDeLetras {
    static void main() {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        Map<Character, Integer> total = new HashMap<>();
=======
        Map<Character, Integer> contador = new HashMap<>();
>>>>>>> 3aeeeee54d74b4db5320b68cf19b7a5e610258fd
        String frase;
        char letra;

        System.out.print("Frase --> ");
<<<<<<< HEAD
        frase = sc.nextLine().toLowerCase();
=======
        frase = sc.nextLine();
>>>>>>> 3aeeeee54d74b4db5320b68cf19b7a5e610258fd

        for(int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            if(Character.isLetter(letra)) {
<<<<<<< HEAD
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

=======

            }
        }

>>>>>>> 3aeeeee54d74b4db5320b68cf19b7a5e610258fd
    }
}
