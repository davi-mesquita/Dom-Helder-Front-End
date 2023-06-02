public class C09EX01 {
    public static void main(String[] args) {
        double primeiraSerie=0, soma=0;
        for(int aux=1;aux<=37 ;aux++){

            primeiraSerie = ((38.0-aux) * (39.0-aux) )/aux;
            soma += primeiraSerie;
        }
        System.out.println(soma);
    }
}
