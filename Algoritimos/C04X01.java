import java.util.Scanner;
public class C04X01 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String Nome, SegundoNome, Sobrenome;
        int idade;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe seu primeiro nome: ");
        Nome = input.nextLine();
        System.out.print("Informe seu segundo nome: ");
        SegundoNome = input.nextLine();
        System.out.print("Informe seu sobrenome: ");
        Sobrenome = input.nextLine();
        System.out.print("Informe sua idade: ");
        idade = input.nextInt();
        System.out.println(Nome + ", " + SegundoNome + " " + Sobrenome + "\nIdade: " + idade + " anos.");
        input.close();
    }
}
