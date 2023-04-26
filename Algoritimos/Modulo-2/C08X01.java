import java.util.Scanner;
public class C08X01 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            Double raio, area;
            System.out.println("Digite o raio da esfera: ");
            raio = scanner.nextDouble();
            area = ( Math.PI * Math.pow(raio, 2));
            System.out.println("Tamanho da área do circulo é: " + area);
        }
        scanner.close();
    }
}
