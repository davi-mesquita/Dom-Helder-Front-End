import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precototalP, precototal = 0, insumos, quantidade, preco, maior = 0;
        String produto, nomeMaior = "";

        System.out.print("Digite o número de Insumos consumidos no projeto: ");
        insumos = teclado.nextDouble();

        for (int aux = 0 ; aux < insumos; aux++){
            teclado.nextLine();

            System.out.print("Nome do Produto: ");
            produto = teclado.nextLine();

            System.out.print("Preço do Produto: ");
            preco = teclado.nextDouble();

            System.out.print("Quantidade de Produto: ");
            quantidade = teclado.nextDouble();

            if (aux == 1 || preco > maior){
                maior = preco;
                nomeMaior = produto;
            }

            precototalP = preco * quantidade;

            precototal += precototalP;
        }

        double media = precototal / insumos;

        System.out.println("Custo total: " + precototal);
        System.out.println("Media dos Custos Parciais: " + media);
        System.out.println("Nome do Insumo de maior custo parcial: " + nomeMaior);

        teclado.close();
;    }
}
