import javax.swing.JOptionPane;
public class C06X16 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        double N1, N2, N3;
        String n1, n2, n3;
        n1 = JOptionPane.showInputDialog
        (
            null,
            "Digite a sua nota: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        n2 = JOptionPane.showInputDialog
        (
            null,
            "Digite a sua nota: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        n3 = JOptionPane.showInputDialog
        (
            null,
            "Digite a sua nota: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        N1 = Double.parseDouble(n1);
        N2 = Double.parseDouble(n2);
        N3 = Double.parseDouble(n3);
        double mediaPonderada = (N1 * 2 + N2 * 3 + N3 * 5) / 10;
        JOptionPane.showMessageDialog
        (
            null,
            "A sua média ponderada é: " + mediaPonderada,
            "Aula de java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
