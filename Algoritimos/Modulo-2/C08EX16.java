import java.util.Scanner;

public class C08EX16 {
    public static void main(String[] args) {
        int soma=0;
        Scanner teclado = new Scanner(System.in);

        for (int aux=1000; aux < 2000; aux++){
            if (aux % 2 != 0){
                soma += aux;
            }
        }

        double resultado = soma/500;

        System.out.println("média dos números ímpares que estejam dentro do intervalo de 1000 a 2000 " + resultado);

        teclado.close();
    }
}
