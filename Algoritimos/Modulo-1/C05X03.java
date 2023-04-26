import javax.swing.JOptionPane;
public class C05X03 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        Double liquido, ir,salario,dependentes;
        String valordeSalario = JOptionPane.showInputDialog(
             null,
             "Digite o seu salario:",
             "Aula de Java",
             JOptionPane.QUESTION_MESSAGE
             );
        String valordeDependentes = JOptionPane.showInputDialog(
            null,
            "Digite o numero de dependentes:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        salario = Double.valueOf(valordeSalario);
        dependentes = Double.valueOf(valordeDependentes);
        liquido = salario - (dependentes*60);
        ir = liquido * 0.15;
        JOptionPane.showMessageDialog(
            null,
            "O seu imposto de renda é: " + ir,
            "Aula de Java",
            JOptionPane.INFORMATION_MESSAGE);

    }
}
