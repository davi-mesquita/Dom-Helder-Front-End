import javax.swing.JOptionPane;
public class C05X10 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entrada;
        char[] numeros = new char[5];
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de um número com 5 digitos: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        for(int i = 0; i < entrada.length(); i++){
            numeros[i] = entrada.charAt(i);
        }
        JOptionPane.showMessageDialog
        (
            null,
            "O número que você escreveu quebrado em linhas é: \n" + numeros[0] + "\n" + numeros[1] + "\n" + numeros[2] + "\n" + numeros[3] + "\n" + numeros[4],
            "Aula de java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
