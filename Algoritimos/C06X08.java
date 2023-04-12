import javax.swing.JOptionPane;
public class C06X08 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String nome, entrada;
        double altura, pesomin,pesomax;
        nome = JOptionPane.showInputDialog
        (
            null,
            "Digite seu nome: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite sua altura: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        altura = Double.parseDouble(entrada);
        pesomin = 20 * Math.pow(altura,2);
        pesomax = 25 * Math.pow(altura,2);
        JOptionPane.showMessageDialog
        (
            null,
            "Olá " + nome + ", seu peso ideal é entre " + pesomin + " e " + pesomax,
            "Aula de Java",
            JOptionPane.INFORMATION_MESSAGE
        );

    }
}
