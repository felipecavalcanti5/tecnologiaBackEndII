import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class mostrarIniciais {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome completo:");
    String nomeCompleto = scanner.nextLine();

    String[] partesNome = nomeCompleto.split(" ");
    StringBuilder iniciais = new StringBuilder();

    Set<String> preposicoes = new HashSet<>(Arrays.asList(
            "de", "do", "da", "dos", "das", "e", "a", "o", "as", "os"
    ));

    for (String parte : partesNome) {
        if (!parte.isEmpty() && !preposicoes.contains(parte.toLowerCase())) {
            iniciais.append(parte.charAt(0)).append(".");
        }
    }

    System.out.println("Iniciais do nome (excluindo preposições): " + iniciais.toString().toUpperCase());
    }
}
