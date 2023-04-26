import java.util.Scanner;
public class C04X03 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double num1, num2, num3, num4, num5;
        System.out.print("Informe o primeiro número: ");
            num1 = input.nextDouble();
        System.out.print("Informe o segundo número: ");
            num2 = input.nextDouble();
        System.out.print("Informe o terceiro número: ");
            num3 = input.nextDouble();
        System.out.print("Informe o quarto número: ");
            num4 = input.nextDouble();
        System.out.print("Informe o quinto número: ");
            num5 = input.nextDouble();
        System.out.println(
            "Quantidade de Poluente Emitido x Valor da Multa\n" +
            
            "Até " + num1 + " multa de R$" + num3 + ",00\n" 
            + "Entre " + num1 + " e " + num2 + " multa de R$" + num4 + ",00\n" +
            "Acima de " + num2 + " multa de R$" + num5 + ",00 por poluente emitido"
            
            );    
        input.close();
    }
}
