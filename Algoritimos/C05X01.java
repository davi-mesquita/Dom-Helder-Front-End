import javax.swing.JOptionPane;
public class C05X01 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        Double total, x;
        String valordeX = JOptionPane.showInputDialog(
             null,
             "Digite o valor de x:",
             "Aula de Java",
             JOptionPane.QUESTION_MESSAGE
             );
        x = Double.valueOf(valordeX);
        total = Math.pow(x, 3) + 4*x+10;
        JOptionPane.showMessageDialog(
            null,
            "O resultado da função é: " + total,
            "Aula de Java",
            JOptionPane.INFORMATION_MESSAGE);

    }
}
