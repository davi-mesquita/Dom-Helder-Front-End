import java.util.Scanner;

public class C08EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadeProdutos, codigo;
        double valor=0, soma=0;

        System.out.println("Quantos produtos foram vendidos: ");
        quantidadeProdutos = teclado.nextInt();

        for (int aux=1; aux <= quantidadeProdutos; aux++){
            System.out.println("Digite o codigo do produto (1-5): ");
            codigo = teclado.nextInt();

            if (codigo == 1){
                valor = 1565.0;
            }else if (codigo == 2){
                valor = 1890.0;
            } else if (codigo == 3) {
                valor = 2150.0;
            } else if (codigo == 4) {
                valor = 2963.0;
            } else if (codigo == 5) {
                valor = 3750.0;
            }else {
                System.out.println("Não exite esse produto");
            }

            soma += valor;
        }
        System.out.println("Faturamento total: " +soma);
        teclado.close();
    }
}
