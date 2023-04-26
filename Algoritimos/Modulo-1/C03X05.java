import java.util.Scanner;
public class C03X05 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String nome;
        int anoNascimento, anoAtual, idade;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        nome = input.nextLine();
        System.out.print("Informe o ano de nascimento: ");
        anoNascimento = input.nextInt();
        System.out.print("Informe o ano atual: ");
        anoAtual = input.nextInt();
        idade = anoAtual - anoNascimento;
        System.out.println("Olá " + nome + ", você tem/terá " + idade + " anos.");
        input.close();
    }
}
