import java.util.Scanner;

public class C08EX18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 9: ");
        int numero = teclado.nextInt();

        if (numero < 1 || numero < 9){
            System.out.println("Numero invalido");
            return;
        }

        for (int aux = 0; aux < 10; aux++){
            int resultado = numero * aux;
            System.out.println(aux + " X " + numero + " = " + resultado);
        }

        teclado.close();
    }
}
