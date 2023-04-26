import javax.swing.JOptionPane;
public class C06X13 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String hi, mi, hf, mf;
        int hi1, mi1, hf1, mf1;
        hi = JOptionPane.showInputDialog
        (
            null,
            "Hora inicial: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        hi1 = Integer.parseInt(hi);
        mi = JOptionPane.showInputDialog
        (
            null,
            "Minuto inicial: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        mi1 = Integer.parseInt(mi);
        hf = JOptionPane.showInputDialog
        (
            null,    
            "Hora final: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        hf1 = Integer.parseInt(hf);
        mf = JOptionPane.showInputDialog
        (
            null,    
            "Minuto final: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        mf1 = Integer.parseInt(mf);
        int t1 = hi1 * 60 + mi1;
        int t2 = hf1 * 60 + mf1;
        int t3 = t2 - t1;
        int t4 = t3 / 60;
        int t5 = t3 % 60;
        JOptionPane.showMessageDialog(null, "O tempo total de duração foi de " + t4 + " horas e " + t5 + " minutos.");
    }
}
