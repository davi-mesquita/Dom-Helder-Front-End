import java.util.Scanner;

public class C09EX09 {
    public static void main(String[] args) {
        double num=0, div=0, soma=0,p1;
        Scanner teclado = new Scanner(System.in);

//        System.out.print("Digite o valor da Serie: ");
//        int serie = teclado.nextInt();

        for (int aux=1;aux<=30;aux++){

            num= Math.pow(3.0,aux+1);
            div= (10.0+(aux-1)) * (Math.sqrt( Math.pow(aux,4) ));

            soma += num/div;
        }
        p1 = Math.pow(soma,3);
        System.out.println(   100 - p1   );

        teclado.close();
    }
}
