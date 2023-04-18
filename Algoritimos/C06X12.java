import javax.swing.JOptionPane;
public class C06X12 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String produzidas,defeitos,precosuni,temp,valmensal;
        double caixas,galpoes,produzidas1,defeitos1,precosuni1,temp1,valmensal1, total;
        produzidas = JOptionPane.showInputDialog
        (
                null,
                "Digite a quantidade de bolas produzidas: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        defeitos = JOptionPane.showInputDialog
        (
                null,
                "Digite a quantidade de bolas defeituosas: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        precosuni = JOptionPane.showInputDialog
        (
                null,
                "Digite o preço unitário das caixas: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        temp = JOptionPane.showInputDialog
        (
                null,
                "Digite o tempo até a copa: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        valmensal = JOptionPane.showInputDialog
        (
                null,
                "Digite o valor mensal do aluguel: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        produzidas1 = Double.parseDouble(produzidas);
        defeitos1 = Double.parseDouble(defeitos);
        precosuni1 = Double.parseDouble(precosuni);
        temp1 = Double.parseDouble(temp);
        valmensal1 = Double.parseDouble(valmensal);
        caixas = precosuni1 * ((produzidas1 - defeitos1) / 10);
        galpoes = caixas / 850;
        total = (galpoes * temp1 * valmensal1) + caixas;
        JOptionPane.showMessageDialog
        (
                null,
                "O valor total é de: " + total,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
