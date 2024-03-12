import java.util.Scanner;

public class validadorNumPrimo {
    public static void main(String[] args) {

        int num;
        int c = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                c++;
            }
        }if(c == 2){
            System.out.println(num + " é primo");
        } else{
            System.out.println(num + " não é primo");
        }
    }

    }

