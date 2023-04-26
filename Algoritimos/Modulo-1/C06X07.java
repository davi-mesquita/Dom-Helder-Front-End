import javax.swing.JOptionPane;
public class C06X07 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entrada;
        double salario, bruto,liquido, imposto;
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor do seu salario: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        salario = Double.parseDouble(entrada);
        if(salario <= 300){
            bruto = 500 + (salario * 0.7);
            imposto = bruto * 0.25;
            liquido = bruto - imposto;
            JOptionPane.showMessageDialog
            (
                null,
                "Seu Pl Liquido é: R$ " + liquido,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else if(salario > 300 & salario <= 1000){
            bruto = 200 + (salario * 0.5);
            imposto = bruto * 0.25;
            liquido = bruto - imposto;
            JOptionPane.showMessageDialog
            (
                null,
                "Seu Pl Liquido é: R$ " + liquido,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            bruto = salario * 0.3;
            imposto = bruto * 0.25;
            liquido = bruto - imposto;
            JOptionPane.showMessageDialog
            (
                null,
                "Seu Pl Liquido é: R$ " + liquido,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
