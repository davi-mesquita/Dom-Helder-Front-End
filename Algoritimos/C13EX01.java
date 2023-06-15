import java.util.*;

public class C13EX01 {
  public static void main(String[] args) {
    List<String> LISTA = new ArrayList<String>();
    LISTA.size();
    LISTA.add("A");
    LISTA.add(3,"A");
    LISTA.set(1,"B");
    LISTA.remove("A");
    LISTA.remove(0);
    LISTA.get(0);
    LISTA.indexOf("A");
    LISTA.sort(null);
    //IMPRIMIR O CONTEUDO DE UMA LISTA DINAMICA - FORMA 1 
    for (int i=0; i<LISTA.size(); i++) {
      System.out.println(LISTA.get(i));
    }
    //IMPRIMIR O CONTEUDO DE UMA LISTA DINAMICA - FORMA 2
    for (String s: LISTA) {
      System.out.println(s);
    }
    // ORDERNAR UMA LISTA DINAMICA
    String temp;
    for (int i=0; i<LISTA.size()-1; i++) {
      for (int j=0; j<LISTA.size()-1; j++) {
        if (LISTA.get(j).compareToIgnoreCase(LISTA.get(j+1)) > 0) {
          temp = LISTA.get(j);
          LISTA.set(j,LISTA.get(j+1));
          LISTA.set(j+1,temp);
        }
      }
    }
  }
}
