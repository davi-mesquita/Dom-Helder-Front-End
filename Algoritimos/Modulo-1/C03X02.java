import java.util.Scanner;
public class C03X02 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        long n1,n2,n3,soma;
        Double media;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        n1 = input.nextLong();
        System.out.print("Informe o segundo número: ");
        n2 = input.nextLong();
        System.out.print("Informe o terceiro número: ");
        n3 = input.nextLong();
        soma = n1 + n2 + n3;
        media = soma / 3.0;
        System.out.println("A média dos números é: " + media);
        input.close();
    }
}
