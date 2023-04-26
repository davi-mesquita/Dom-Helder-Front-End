import javax.swing.JOptionPane;
public class C06X17 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String[] entrada = {"Sim","Não"};
        int[] valor = new int[8];
        valor[0] = JOptionPane.showOptionDialog(
            null,
            "Você tem curso técnico de programação",
            "Entrevista de Java",
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,
            null,
            entrada,
            "Sim"
        );
        valor[1] = JOptionPane.showOptionDialog(
            null,
            "Você tem curso superior de programação",
            "Entrevista de Java",
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,
            null,
            entrada,
            "Sim"
        );
        valor[2] = JOptionPane.showOptionDialog(
            null,
            "Você tem menos de 3 anos de experiência em programação",
            "Entrevista de Java",
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,
            null,
            entrada,
            "Sim"
        );
        valor[3] = JOptionPane.showOptionDialog(
            null,
            "Você se considera uma pessoa criativa",
            "Entrevista de Java",
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,
            null,
            entrada,
            "Sim"
        );
        valor[4] = JOptionPane.showOptionDialog(
            null,
            "Você prefere liderar a ser liderado",
            "Entrevista de Java",
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,
            null,
            entrada,
            "Sim"
        );
        valor[5] = JOptionPane.showOptionDialog(
            null,
            "Você prefere trabalhar sozinho a trabalhar em equipe",
            "Entrevista de Java",
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,
            null,
            entrada,
            "Sim"
        );
        valor[6] = JOptionPane.showOptionDialog(
            null,
            "Você é autodidata (Aprende Sozinho)",
            "Entrevista de Java",
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,
            null,
            entrada,
            "Sim"
        );
        valor[7] = JOptionPane.showOptionDialog(
            null,
            "Você aceitaria uma remuneração inicial de R$1500.00",
            "Entrevista de Java",
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,
            null,
            entrada,
            "Sim"
        );
        valor[8] = JOptionPane.showOptionDialog(
            null,
            "Você aceitaria trabalhar em escritório da empresa dentro da grande BH",
            "Entrevista de Java",
            JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,
            null,
            entrada,
            "Sim"
        );
        
    }
}
