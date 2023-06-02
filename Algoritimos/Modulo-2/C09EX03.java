import java.util.Scanner;

public class C09EX03 {
    public static void main(String[] args) {
        double num, div, soma=0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da Serie: ");
        int serie = teclado.nextInt();

        for (int aux=1;aux<=serie;aux++){
            num= 1 + (Math.sqrt(aux*4));
            div= aux * 3;
            
            soma += num/div;
        }
        System.out.println(soma);

        teclado.close();
    }
}
