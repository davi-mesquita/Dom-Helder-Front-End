import javax.swing.JOptionPane;
public class C04X05 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String nome,cpf,rg,eleitor,cnh,empresa,salario;
        nome = JOptionPane.showInputDialog(
            null,
            "Informe seu nome completo:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        cpf = JOptionPane.showInputDialog(
            null,
            "Informe seu CPF:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        rg = JOptionPane.showInputDialog(
            null,
            "Informe seu RG:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        eleitor = JOptionPane.showInputDialog(
            null,
            "Informe seu título de eleitor:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        cnh = JOptionPane.showInputDialog(
            null,
            "Informe seu CNH:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        empresa = JOptionPane.showInputDialog(
            null,
            "Informe sua empresa:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        salario = JOptionPane.showInputDialog(
            null,
            "Informe seu salario:",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        Double numSalario = Double.valueOf(salario);
        JOptionPane.showMessageDialog(
            null,
            "FICHA FUNCIONAL DE: ".replace("\t","....................") + nome + 
            "\n\nCPF: \t".replace("\t","....................") + cpf + 
            "\nC.I.: \t".replace("\t","....................") + rg + 
            "\nTítulo de eleitor:\t".replace("\t","....................") + eleitor + 
            "\nCarteira de motorista:\t".replace("\t","....................") + cnh + 
            "\n\nEmpresa: ".replace("\t","....................") + empresa + 
            "\nSalário: R$".replace("\t","....................") + numSalario,
            "Aula de Java",
            JOptionPane.INFORMATION_MESSAGE 
            );
    }
}
