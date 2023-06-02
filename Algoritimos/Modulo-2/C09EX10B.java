public class C09EX10B {
    public static void main(String[] args) {
        double num, div, soma=0;
        for (int aux = 1 ; aux<=100; aux++){

            num = aux*2;
            div = aux*3;

            soma +=num/div;
        }
        System.out.println(1 + Math.sqrt(soma));
    }
}
