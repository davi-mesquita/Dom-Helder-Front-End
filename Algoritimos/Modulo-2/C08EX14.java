import java.util.Scanner;

public class C08EX14 {
    public static void main(String[] args) {
        String asterisco;
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número (entre 1 e 20): ");
        numero = teclado.nextInt();

        if (numero < 20 || numero > 1){
            System.out.println("numero invalido");
            return;
        }

        for (int i = 0; i < numero; i++) {

            for (int j = 0; j < numero; j++) {
                System.out.print("#" + " ");
            }

            System.out.println();
        }


    }
}

