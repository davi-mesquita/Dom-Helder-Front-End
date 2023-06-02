public class C09EX08 {
    public static void main(String[] args) {
        double num, div, soma=0;
        for (int aux=1;aux<=20;aux++){

            num= ((aux * 2.0 ) + 1 ) *  Math.sqrt( (aux * 4.0) + 1  );
            div= Math.pow(5,aux);

            soma += num/div;
        }
        System.out.println(Math.pow(soma,2));
    }
}
