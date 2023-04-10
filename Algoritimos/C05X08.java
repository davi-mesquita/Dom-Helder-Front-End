import javax.swing.JOptionPane;
public class C05X08 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String valorS, valorA;
        Double s, a, r;
        valorS = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor da Área de um setor circular: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        valorA = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de ângulo: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        s = Double.parseDouble(valorS);
        a = Double.parseDouble(valorA);
        r = Math.sqrt(s / (Math.PI * a / 360));
        JOptionPane.showMessageDialog
        (
            null,
            "O valor de r é: " + r,
            "Aula de java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
