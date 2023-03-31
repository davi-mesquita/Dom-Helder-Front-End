import javax.swing.JOptionPane;
public class C05X02 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        Double area, volume, r;
        String valordeR = JOptionPane.showInputDialog(
             null,
             "Digite o valor de R:",
             "Aula de Java",
             JOptionPane.QUESTION_MESSAGE
             );
        r = Double.valueOf(valordeR);
        area = 4 * Math.PI * Math.pow(r, 2);
        volume = (4 * Math.PI * Math.pow(r, 3))/3;
        JOptionPane.showMessageDialog(
            null,
            "Área: " + area + "\nVolume: " + volume,
            "Aula de Java",
            JOptionPane.INFORMATION_MESSAGE);

    }
}
