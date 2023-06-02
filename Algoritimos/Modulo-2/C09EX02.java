public class C09EX02 {
    public static void main(String[] args) {
        double num=0, div=0,soma=0;
        for (int aux=1; aux<=100;aux++){

            num = aux;

            div= aux -1 + (Math.pow(aux,2));

            soma +=num/div;
        }
        System.out.println(soma);
    }
}
