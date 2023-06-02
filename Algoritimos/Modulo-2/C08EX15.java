import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {
        int cont1=0;
        String nomeM="", cargoM = "";
        double salariosoma = 0, salarioM =0, salarioMedia=0;

        Scanner teclado = new Scanner(System.in);

        for (int aux=0; aux < 1000; aux++){


            System.out.print("Nome do Funcionario: " );
            String nome = teclado.nextLine();

            System.out.print("Cargo: ");
            String cargo = teclado.nextLine();

            System.out.print("Salario: ");
            double salario = teclado.nextDouble();

            System.out.print("idade: ");
            int idade = teclado.nextInt();
            teclado.nextLine();

            if (idade > 50 && salario > 10000){
                System.out.println("O senhor é Sênior");
            }else {
                System.out.println("O senhor não é Sênior");
            }

            if (idade <= 18){
                cont1++;
                salariosoma += salario;
            }

            if (aux == 0 || salario > salarioM){
                salarioM = salario;
                nomeM = nome;
                cargoM = cargo;
            }
        }

        salarioMedia = salariosoma / cont1;

        System.out.println("A média dos salários dos funcionários com até 18 anos " + salarioMedia);
        System.out.println("O nome e o cargo do funcionário que tem o maior salário: " + nomeM +" e "+ cargoM);


        teclado.close();
    }
}
