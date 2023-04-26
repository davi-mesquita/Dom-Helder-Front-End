import java.util.Scanner;
public class C08X04 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Nome;
        int idade, cont18 = 0,cont = 0;
        for (int i = 0; i < 50; i++) {
            System.out.println("Digite seu nome");
            Nome = scanner.nextLine();
            System.out.println("Digite sua idade");
            idade = scanner.nextInt();
            scanner.nextLine();
            if(idade <= 18){
                cont18++;
            }else{
                cont++;
            }
        }
        System.out.println("Até 18 anos: " + cont18 + "\nAcima de 18 anos: " + cont );
        scanner.close();
    }
}
