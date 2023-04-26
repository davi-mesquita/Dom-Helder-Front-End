import javax.swing.JOptionPane;

public class C06X10 {
    // Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String cP, nD, tD;
        double capitalAplicado, taxaDiaria, rendimento, imposto,valoresgate;
        int numeroDias;
        cP = JOptionPane.showInputDialog(
                null,
                "Digite o capital aplicado: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        nD = JOptionPane.showInputDialog(
                null,
                "Digite o número de dias: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        tD = JOptionPane.showInputDialog(
                null,
                "Digite a taxa diária: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        capitalAplicado = Double.parseDouble(cP);
        numeroDias = Integer.parseInt(nD);
        taxaDiaria = Double.parseDouble(tD);
        taxaDiaria = taxaDiaria / 100;
        rendimento = capitalAplicado * numeroDias * taxaDiaria;
        imposto = rendimento * 0.15;
        valoresgate = capitalAplicado + rendimento - imposto - 10;
        JOptionPane.showMessageDialog(
                null,
                "O Valor de resgate é de: " + valoresgate,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
                );
    }
}
