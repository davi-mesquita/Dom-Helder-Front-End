import java.util.Scanner;

public class C08EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notafinal, faltas, cont1, cont2;

        cont1 = 0;
        cont2 = 0;
        ;

        for (int aux = 1; aux <= 3; aux++) {
            System.out.print("Digite o valor da sua Nota Final: ");
            notafinal = teclado.nextDouble();

            System.out.print("Digite seu número de faltas: ");
            faltas = teclado.nextDouble();

            if (notafinal < 0)
                break;

            if (notafinal >= 65 && faltas <= 16) {
                System.out.println("Aprovado");
                cont1 += notafinal;
            } else {
                System.out.println("Reprovado");
            }


            if (faltas > 16 ){
                cont2++;
            }
        }

        double media = cont1 / 3;

            System.out.println("media das notas dos aprovados: " + cont1);
            System.out.println("Quantidade de alunos com mais de 16 faltas = " + cont2);

            teclado.close();

    }
}
