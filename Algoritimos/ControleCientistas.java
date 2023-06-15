import java.util.*;

public class ControleCientistas {
    static List<String> nomes = new ArrayList<String>();
    static List<Integer> idades = new ArrayList<Integer>();
    static List<String> paises = new ArrayList<String>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Declaração de variável
        String nome, novoNome;
        int pos;
        do {
           System.out.println("Informe nome: ");
           nome = teclado.nextLine();
           pos = nomes.indexOf(nome);
           if (pos < 0) {
              System.out.println("Informe idade: ");
              int idade = teclado.nextInt();
              System.out.println("Informe pais: ");
              String pais = teclado.nextLine();
              nomes.add(nome);
              idades.add(idade);
              paises.add(pais);
           } else {
              novoNome = manutencao(pos);
           }
        } while (!nome.equals("X"));
        for (int aux=0; aux<nomes.size(); aux++) {
           System.out.println("nome = "+nomes.get(aux));
        }
        String temp;
        int temp2;
        for (int aux = 0; aux < nomes.size()-1; aux++)
           for (int x = 0; x < nomes.size()-1; x++)
              if (nomes.get(x).compareToIgnoreCase(nomes.get(x+1)) > 0) {
                 temp = nomes.get(x);
                 nomes.set(x,nomes.get(x+1));
                 nomes.set(x+1,temp);
                 temp2 = idades.get(x);
                 idades.set(x,idades.get(x+1));
                 idades.set(x+1,temp2);
                 temp = paises.get(x);
                 paises.set(x,paises.get(x+1));
                 paises.set(x+1,temp);
              }
    }

    static String manutencao(int pos) {
        System.out.println("Nome: "+nomes.get(pos));
        System.out.println("Idade: "+idades.get(pos));
        System.out.println("País: "+paises.get(pos));
//        nomes.remove(pos);
//        idades.remove(pos);
//        paises.remove(pos);
        System.out.println("Informe novo nome: ");
        String nome = teclado.nextLine();
        System.out.println("Informe nova idade: ");
        int idade = teclado.nextInt();
        System.out.println("Informe novo pais: ");
        String pais = teclado.nextLine();
        nomes.set(pos,nome);
        idades.set(pos,idade);
        paises.set(pos,pais);
        return nome;
    }
}
