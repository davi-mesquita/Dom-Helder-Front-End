import java.util.Scanner;
public class C08EX06 {
    public static void main(String[] args) {
        double numero, soma4, contPar, contImpar, cont3, cont4;
        contPar = 0;
        contImpar = 0;
        cont3 = 0;
        cont4 = 0;
        soma4 = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++){
            System.out.println("Digite um número");
            numero = teclado.nextDouble();

            if (numero % 2 == 0){
                contPar++;
            }else {
                contImpar++;
            }

            if (numero % 4 == 0){
                cont3++;
                soma4 += numero;
            }

            if (numero % 3 == 0){
                cont4++;
            }
        }
        soma4 += cont4;

        System.out.println("Quantidade de numeros pares: " +contPar);
        System.out.println("Soma dos numeros divisivéis por 4: " + soma4);
        System.out.println("Quantidade de numeros divisiveis por 3: " + cont4);

        teclado.close();
    }
}
