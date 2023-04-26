import java.util.Scanner;
public class C03X01 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        long numero = input.nextLong();
        long fatorial = 1L;
        for (long i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + numero + " é " + fatorial);
        input.close();
    }
}
