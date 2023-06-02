import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
  public static void main(String[] args) {
    List<String> Listacpf = new ArrayList<String>();
    List<String> Listaendereco = new ArrayList<>();
    String cpf, endereco, search, teste;
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.println("Digite o seu CPF: ");
      cpf = teclado.nextLine();
      if (!cpf.equalsIgnoreCase("0")) {
        break;
      }
      System.out.println("Digite o seu endereço completo: ");
      endereco = teclado.nextLine();
      Listacpf.add(cpf);
      Listaendereco.add(endereco);
      System.out.println("Deseja Buscar um CPF ? (S/N)");
      teste = teclado.nextLine();
      if(teste.equalsIgnoreCase("S")){
        System.out.println("Qual CPF deseja pesquisar ?");
        search = teclado.nextLine();
        int pos = Listacpf.indexOf(search);
        if(pos == -1){
          System.out.println("CPF não encontrado! \n Gostaria de adicionar?");
          teste = teclado.nextLine();
          if(teste.equalsIgnoreCase("S")){
            Listacpf.add(search);
            pos = Listacpf.indexOf(search);
            System.out.println("CPF " + Listacpf.get(pos) + " Adicionado com sucesso !!");
          }else{
            System.out.println("Nome encontrado na posição " + (pos+1)+ "!");
            System.out.println("Deseja atualiza-lo ou removelo da lista ? (A/R)");
            String resp = teclado.nextLine();
            if(resp.equalsIgnoreCase("A")){
              System.out.println("Informe novo CPF: ");
              cpf = teclado.nextLine();
              Listacpf.set(pos,cpf);
              pos = Listacpf.indexOf(cpf);
              System.out.println("CPF " + Listacpf.get(pos) + " Atualizado com sucesso !!");
            }else{
              Listacpf.remove(pos);
              System.out.println("CPF removido" + cpf + "com sucesso!!");
            }
          }
        }
      }
    } while (!cpf.equalsIgnoreCase("0"));

  }
}
