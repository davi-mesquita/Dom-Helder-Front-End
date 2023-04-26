import javax.swing.JOptionPane;
public class C06X14 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String valor;
        int n;
        valor = JOptionPane.showInputDialog
        (
            null,
            "Digite um número de 4 digitos",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        n = valor.length();
        if(n > 4 || n < 0 ){
            JOptionPane.showMessageDialog
            (
                null,
                "Número inválido. \n Digite um número de 4 digitos.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }else{
            String fraseinvertida = new StringBuilder(valor).reverse().toString();
            n = Integer.parseInt(fraseinvertida);
            JOptionPane.showMessageDialog
            (
                null,
                "O número invertido é: " + n,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }

    }
}
