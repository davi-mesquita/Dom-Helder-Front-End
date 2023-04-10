import javax.swing.JOptionPane;
public class C05X08 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String valorS, valorA;
        Double s, a, r;
        valorS = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de s: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        valorA = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de a: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        s = Double.parseDouble(valorS);
        a = Double.parseDouble(valorA);
        r = (s * Math.sin(a)) / (1 - Math.cos(a));
        JOptionPane.showMessageDialog
        (
            null,
            "O valor de r é: " + r,
            "Aula de java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
