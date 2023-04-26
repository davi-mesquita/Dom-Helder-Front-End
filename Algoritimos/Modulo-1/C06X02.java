import javax.swing.JOptionPane;
public class C06X02 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entrada;
        double poluente;
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite a quantidade de poluente: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        poluente = Integer.parseInt(entrada);
        if(poluente <= 1500){
            JOptionPane.showMessageDialog
            (
                null,
                "Poluição dentro do limite, você não precisa pagar multa.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else if(poluente > 1500 & poluente <= 3500){
            JOptionPane.showMessageDialog
            (
                null,
                "Poluição em nivel médio, você precisa pagar multa de  R$ 3.000,00 .",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );

        }else{
            JOptionPane.showMessageDialog
            (
                null,
                "Poluição em nivel alto, você precisa pagar multa de  R$" + (poluente * 5000),
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
