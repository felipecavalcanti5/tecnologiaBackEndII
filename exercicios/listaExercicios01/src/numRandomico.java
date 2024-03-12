import java.util.Random;
import java.util.Scanner;

public class numRandomico {
    public static void main(String[] args) {

        int numEscolhido;
        int tentativa = 0;

        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000) + 1;
        System.out.println(numeroAleatorio);



        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 1000");
        numEscolhido = scan.nextInt();

        for (int i=0; i<=tentativa; i++){

            if(numEscolhido < numeroAleatorio) {
                System.out.println( "o número escolhido é menor que o número aleatório");
                tentativa ++;
                System.out.println("Escolha outro número de 1 a 1000");
                numEscolhido = scan.nextInt();
            } else if (numEscolhido > numeroAleatorio){
                System.out.println( "o número escolhido é maior que o número aleatório");
                System.out.println("Escolha outro número de 1 a 1000");
                numEscolhido = scan.nextInt();
            }else{
                System.out.println("Parabéns! você acertou na " + (tentativa + 1) + "ª tentativa");
            }
        }
    }
}
