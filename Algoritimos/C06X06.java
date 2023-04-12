import javax.swing.JOptionPane;
public class C06X06 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entradaA, entradaB, entradaC;
        double a, b, c, delta;
        entradaA = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de A: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        entradaB = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de B: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        entradaC = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de C: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        a = Double.parseDouble(entradaA);
        b = Double.parseDouble(entradaB);
        c = Double.parseDouble(entradaC);
        delta = Math.pow(b, 2) - 4 * a * c;
        if(delta < 0){
            JOptionPane.showMessageDialog
            (
                null,
                "O valor de delta é: " + delta + "\n Não existe raiz real.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else if(delta > 0){
            JOptionPane.showMessageDialog
            (
                null,
                "O valor de delta é: " + delta + "\n Existem duas raizes reais.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog
            (
                null,
                "O valor de delta é: " + delta + "\n Existe uma raiz real.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }

    }
}
