public class C09EX10C {
    public static void main(String[] args) {
        double num, div, soma=0;
        for (int aux = 1 ; aux<=100; aux++){

            num = ((aux-1) * 2) + 1;
            div = aux *2;

            soma += num/div;
        }
        System.out.println( (1.0/3.0) *Math.pow(soma,2));
    }
}
