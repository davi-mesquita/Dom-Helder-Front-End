import javax.swing.JOptionPane;
public class C05X06 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        double d ;
        String a, b, c, x, y;
        a = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de a: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        b = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de b: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        c = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de c: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        x = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de x: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        y = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de y: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        d = (Double.parseDouble(a) * Double.parseDouble(x) + Double.parseDouble(b) * Double.parseDouble(y) + Double.parseDouble(c)) / (Math.sqrt(Math.pow(Double.parseDouble(a), 2) + Math.pow(Double.parseDouble(b), 2)));
        JOptionPane.showMessageDialog
        (
            null,
            "O valor de d é: " + d,
            "Aula de java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
