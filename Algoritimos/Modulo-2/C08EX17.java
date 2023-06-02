import java.util.Scanner;

public class C08EX17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int aux=3; aux <= 12; aux++){
           double fx = Math.sqrt(Math.pow(aux,2) - 3);
            System.out.println("X valendo: "+aux+ " é igual: "+ fx);
        }

        teclado.close();
    }
}
