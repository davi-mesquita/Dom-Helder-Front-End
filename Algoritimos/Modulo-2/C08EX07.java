import java.util.Scanner;

public class C08EX07 {
    public static void main(String[] args) {
        String nome;
        double idade, cont1, cont2,media;

        cont1 = 0;
        cont2 = 0;
        media = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 5; aux++){
            System.out.print("Nome do aluno: ");
            nome = teclado.nextLine();

            System.out.print("Idade do aluno: ");
            idade = teclado.nextDouble();
            teclado.nextLine();

            media += idade;

            if (idade <= 12){
                cont1++;
            }
            if (idade>=30){
                cont2++;
            }


        }
        double mediaIdade = media / 5;
        teclado.close();

        System.out.println("Alunos que tem até 12 anos: " +cont1);
        System.out.println("Alunos que tem acima de 30 anos: "+cont2);
        System.out.println("Media das idades informadas: "+mediaIdade);
    }
}
