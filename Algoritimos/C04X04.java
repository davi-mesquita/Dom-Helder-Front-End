import javax.swing.JOptionPane;
public class C04X04 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String nome,idade;
        nome = JOptionPane.showInputDialog(
            null,
            "Informe seu nome completo:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        idade = JOptionPane.showInputDialog(
            null,
            "Informe sua idade:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        int numIdade = Integer.valueOf(idade);
        JOptionPane.showMessageDialog(
            null,
            "Nome: " + nome + "\nIdade: " + numIdade,
            "Aula de Java",
            JOptionPane.INFORMATION_MESSAGE 
            );
    }
}
