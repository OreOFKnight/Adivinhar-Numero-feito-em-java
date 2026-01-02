import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class adivinha{
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int tentativas = 5;
        int numero = random.nextInt(50) + 1;
        boolean acertou = false;

        try{
            while (tentativas > 0){
                System.out.println("Digite algum numero 0 a 50");
                int resposta = scanner.nextInt();

                if (resposta > 50){
                    System.out.println("Digite um numero de 1 a 50...");
                    continue;
                }

                if (resposta < 0){
                    System.out.println("Digite um numero de 0 a 50...");
                    continue;
                }

                if (numero == resposta){
                    System.out.println("Acertou");
                    acertou = true;
                    break;
                }

                else if(resposta > numero){
                    tentativas -= 1;
                    System.out.printf("Menor! tentativas: %d%n", tentativas);
                }

                else if (resposta < numero) {
                    tentativas -= 1;
                    System.out.printf("Maior! tentativas: %d%n", tentativas);
                }


                
            }
            if (acertou == false){
                System.out.printf("Acabou suas tentativas, o numero era %d%n", numero);
            }
            scanner.close();
            
        }
        catch(InputMismatchException exception){
            System.out.println("Algum erro aconteceu");
        }
    }
}
