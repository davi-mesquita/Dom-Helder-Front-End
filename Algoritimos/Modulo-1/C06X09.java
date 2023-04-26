import javax.swing.JOptionPane;
public class C06X09 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entrada;
        char sexo;
        double altura, imc;

        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite sua altura: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        ); 
        altura = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite seu sexo: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        sexo = entrada.charAt(0);
        if(sexo == 'm' || sexo == 'M'){
            imc = 72.7 * altura - 58;
        }else if(sexo == 'f' || sexo == 'F'){
            imc = 62.1 * altura - 44.7;
        }else{
            JOptionPane.showMessageDialog
            (
                null,
                "Sexo inválido. \n Digite 'm' para masculino ou 'f' para feminino.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }
        JOptionPane.showMessageDialog
        (
            null,
            "Seu IMC é: " + imc,
            "Aula de Java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
