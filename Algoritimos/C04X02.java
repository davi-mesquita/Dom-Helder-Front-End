import java.util.Scanner;
public class C04X02 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, cpf, rg, eleitor, motorista, empresa;
        int salario;
        System.out.print("Informe seu nome: ");
        nome = input.nextLine();
        System.out.print("Informe seu CPF: ");
        cpf = input.nextLine();
        System.out.print("Informe seu RG: ");
        rg = input.nextLine();
        System.out.print("Informe seu título de eleitor: ");
        eleitor = input.nextLine();
        System.out.print("Informe sua carteira de motorista: ");
        motorista = input.nextLine();
        System.out.print("Informe o nome da empresa em que trabalha: ");
        empresa = input.nextLine();
        System.out.print("Informe seu salário: ");
        salario = input.nextInt();
        System.out.println(
            "FICHA FUNCIONAL DE: ".replace("\t","....................") + nome + 
            "\n\nCPF: \t".replace("\t","....................") + cpf + 
            "\nC.I.: \t".replace("\t","....................") + rg + 
            "\nTítulo de eleitor:\t".replace("\t","....................") + eleitor + 
            "\nCarteira de motorista:\t".replace("\t","....................") + motorista + 
            "\n\nEmpresa: ".replace("\t","....................") + empresa + 
            "\nSalário: R$".replace("\t","....................") + salario);
        input.close();

    }
}
