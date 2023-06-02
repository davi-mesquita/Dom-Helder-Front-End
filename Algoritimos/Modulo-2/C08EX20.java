import java.util.Scanner;

public class C08EX20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double multi=0, soma=0;
        System.out.print("Digite o número de Termos: ");
        int termos = teclado.nextInt();


        for (int aux=0; aux < termos; aux++){

            multi = Math.pow(2,aux);
            soma += multi;
        }

        System.out.println(soma);

        teclado.close();
    }
}
