public class C09EX07 {
    public static void main(String[] args) {
        double num, div, soma=0;
        for (int aux =1; aux<=6;aux++){

            num= (aux*2)-2 + (aux*3);
            div= (aux * 6) +1 ;

            soma+=num/div;
        }
        System.out.println(soma);
    }
}
