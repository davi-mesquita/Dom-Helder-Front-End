import javax.swing.JOptionPane;
public class C05X12 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entrada;
        int segundos, horas = 0, minutos = 0;
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de um número em segundos: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        segundos = Integer.parseInt(entrada);
        horas = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        segundos = (segundos % 3600) % 60;
        JOptionPane.showMessageDialog
        (
            null,
            "O número de horas é: " + horas + "\nO número de minutos é: " + minutos + "\nO número de segundos é: " + segundos,
            "Aula de java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
