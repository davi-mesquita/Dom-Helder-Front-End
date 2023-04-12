import javax.swing.JOptionPane;
public class C06X03 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entrada;
        double venda;
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor da venda: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        venda = Integer.parseInt(entrada);
        if(venda <= 1000){
            JOptionPane.showMessageDialog
            (
                null,
                "Você não tem direito a comissão. \n Você receberá seu salário base de R$ 240,00",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else if(venda > 1000 & venda <= 10000){
            JOptionPane.showMessageDialog
            (
                null,
                "Você receberá sua comissão de 10% sobre o valor da venda. \n Você receberá R$ " + (240+(venda * 0.1)),
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog
            (
                null,
                "Você receberá sua comissão de R$ 1000,00 mais o valor fixo do seu salario. \n Você receberá R$ 1240,00",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
