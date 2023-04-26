import java.util.Scanner;
public class C08X02 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nf, tf;
        for (int i = 0; i < 50; i++) {
            System.out.println("Digite sua nota final: ");
            nf = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o total de faltas: ");
            tf = scanner.nextInt();
            if( nf >= 65 & tf < 16){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }
        scanner.close();
    }
}
