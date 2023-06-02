import java.util.Scanner;

public class C08EX09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int pessoas,idade,somaM=0, somaF=0, cont1=0, cont2=0, mediaM = 0, mediaF = 0;
        String sexo, nome;

        System.out.print("Digite o numéro de pessoas: ");
        pessoas = teclado.nextInt();

        for (int aux = 0; aux < pessoas; aux++){
            System.out.print("Nome da Pessoa: ");
            nome = teclado.nextLine();

            System.out.print("Idade da Pessoa: ");
            idade = teclado.nextInt();

            System.out.print("Sexo: ");
            sexo = teclado.nextLine();

            if (sexo .equalsIgnoreCase("M")){
                somaM += idade;
                cont1++;
            } else if (sexo .equalsIgnoreCase("F")) {
                somaF += idade;
                cont2++;
            }else{
                System.out.println("não existe esse gênero");
            }
        }

        mediaM = somaM/cont1 ;
        mediaF = somaF/cont2;

        System.out.println("Média das idades dos homens = "+mediaM);
        System.out.println("Média das idades das mulheres = "+mediaF);

        teclado.close();
    }
}
