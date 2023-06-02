import java.util.Scanner;

public class C09EX05 {
    public static void main(String[] args) {
        double num, div, soma=0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da Serie: ");
        int serie = teclado.nextInt();

        for (int aux=1;aux<=serie;aux++){

            num= ((aux-1) * 2 ) + ((aux) *3);
            div= aux * 6 +1;

            soma += num/div;
        }
        System.out.println(soma*5);

        teclado.close();
    }
}
