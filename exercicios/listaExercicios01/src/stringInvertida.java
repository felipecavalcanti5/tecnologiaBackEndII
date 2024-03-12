import java.util.Scanner;

public class stringInvertida {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String entrada = scan.nextLine();

        String invertida = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            invertida += entrada.charAt(i);
        }

        System.out.println("String invertida: " + invertida);
    }
}

