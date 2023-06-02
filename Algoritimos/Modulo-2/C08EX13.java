import java.util.Scanner;

public class C08EX13 {
    public static void main(String[] args) {
        int cont1=0, cont2=0;
        double menorpopulacao=0;
        String nomeMenor="";
        Scanner arquivo = new Scanner(
                C08EX13.class.getResourceAsStream("c08ex13.txt")
        );

        for (int aux = 1; aux<=5;aux++){


            String nomeCidade;
            nomeCidade = arquivo.nextLine();
            System.out.println("Nome cidade "+ nomeCidade);

            double populacao;
            populacao = arquivo.nextDouble();
            System.out.println("população: "+ populacao);

            double quantidadeEleitores;
            quantidadeEleitores = arquivo.nextDouble();
            System.out.println("Quantidade de Eleitores: " + quantidadeEleitores);

            double quantidadeM;
            quantidadeM = arquivo.nextDouble();
            System.out.println("quantidade de Mulheres: " + quantidadeM);

            double quantidadeH;
            quantidadeH = arquivo.nextDouble();
            System.out.println("quantidade de Homens: " + quantidadeH  );
            arquivo.nextLine();

            double quantidadeG = quantidadeM + quantidadeH;

            if (quantidadeG == populacao){
                System.out.println("Quantidade de pessoas igual a população");
            }else {
                System.out.println("Quantidade de pessoas difere a da população");
            }

            double percentual = (quantidadeEleitores / populacao) * 100;
            System.out.println("Percentual de eleitores em relação a sua população: " + percentual + "%\n \n \n \n \n");


            if (populacao > 1000000 ){
                cont1++;
            }

            if (quantidadeM < quantidadeH){
                cont2++;
            }

            if (aux==1 || populacao < menorpopulacao){
                menorpopulacao = populacao;
                nomeMenor = nomeCidade;
            }

        }
        arquivo.close();

        System.out.println("Quantidade de cidades com a população acima de 1M: "+cont1);
        System.out.println("Quantidade de cidades com mais Mulheres do que homem: " + cont2);
        System.out.println("Cidade com a menor população: "+ nomeMenor);




    }
}
