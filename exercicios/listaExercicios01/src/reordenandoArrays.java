import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class reordenandoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        ArrayList<Integer> valores = new ArrayList<>();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            int valor = letra - 'a' + 1;
            valores.add(valor);
        }

        System.out.println("Array: " + valores);

        Collections.sort(valores);

        System.out.println("Array ordenado: " + valores);

        StringBuilder novaPalavra = new StringBuilder();
        for (int valor : valores) {
            char letra = (char) (valor + 'a' - 1);
            novaPalavra.append(letra);
        }
        System.out.println("Saída: " + novaPalavra);
    }
}
