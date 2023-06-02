import java.util.Scanner;

public class C08EX05a {
    public static void main(String[] args) {
        int voto, cont1, cont2, cont3, cont4;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;

        Scanner teclado = new Scanner(System.in);
        for (int aux = 0; aux <=10; aux++){
            System.out.println("Digite seu voto \n 1 - Fulano \n 2 - Ciclano  \n 3 - Beltrano \n 4 - Nulo");
            voto = teclado.nextInt();

            if (voto == 1){
                cont1++;
            }else
            if (voto == 2){
                cont2++;
            }else
            if (voto ==3){
                cont3++;
            }if (voto == 4 ){
                cont4++;
            }else {
                System.out.println("n exite esse candidado ");
            }
        }

        if (cont1 > cont2 && cont1 > cont3){
            System.out.println("Vencedor 1 - Fulano");
        }else
        if (cont1 < cont2 && cont3 < cont2){
            System.out.println("Vencedor 2 - Ciclano");
        }else {
            System.out.println("vencedor 3 - Beltrano");
        }

        teclado.close();
    }
}

