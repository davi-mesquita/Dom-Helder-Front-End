import javax.swing.JOptionPane;
public class C05X11 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entrada, banco,agencia,sequencial;
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite o número do cheque: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        banco = entrada.substring(0,3);
        agencia = entrada.substring(3,6);
        sequencial = entrada.substring(6,9);
        JOptionPane.showMessageDialog
        (
            null,
            "O número do cheque é: \n" + banco + "\n" + agencia + "\n" + sequencial,
            "Aula de java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
