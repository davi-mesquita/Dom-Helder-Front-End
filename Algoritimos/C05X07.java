import javax.swing.JOptionPane;
public class C05X07 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String valorX;
        double f,x;
        valorX = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de x: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        x = Double.parseDouble(valorX);
        f = Math.sqrt(Math.pow((x/4+1),2)+1/5*x);
        JOptionPane.showMessageDialog
        (
            null,
            "O valor da função é: F("+ x + ") = " + f,
            "Aula de java",
            JOptionPane.INFORMATION_MESSAGE
        );        
    }
}
