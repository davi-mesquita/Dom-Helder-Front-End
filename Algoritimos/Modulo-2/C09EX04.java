import java.util.Scanner;

public class C09EX04 {
    public static void main(String[] args) {
        double num, div, soma=0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da Serie: ");
        int serie = teclado.nextInt();

        for (int aux=1;aux<=serie;aux++){

            num= ( aux * 4 - 3) * (aux * 4 - 2 );
            div= (aux * 4 -1) * (aux * 4);

            soma += num/div;
        }
        System.out.println(Math.sqrt(soma));

        teclado.close();
    }
}
