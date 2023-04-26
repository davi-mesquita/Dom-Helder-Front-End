import javax.swing.JOptionPane;
public class C06X05 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entrada;
        double numero;
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite um numero: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        numero = Double.parseDouble(entrada);
        if(numero % 5 == 0 & numero % 7 == 0){
            JOptionPane.showMessageDialog
            (
                null,
                "O numero " + numero + " é divisivel por 5 e 7.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog
            (
                null,
                "O numero " + numero + " não é divisivel por 5 e 7.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
