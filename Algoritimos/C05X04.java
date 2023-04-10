import javax.swing.JOptionPane;
public class C05X04 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        double x1,y1,x2,y2, distancia;
        String valorX1, valorY1,valorX2, valorY2;
        valorX1 = JOptionPane.showInputDialog
        (
         null,
         "Digite o valor de x1: ",
         "Aula de Java",
         JOptionPane.QUESTION_MESSAGE
        );
        valorY1 = JOptionPane.showInputDialog
        (
         null,
         "Digite o valor de y1: ",
         "Aula de Java",
         JOptionPane.QUESTION_MESSAGE
        );
        valorX2 = JOptionPane.showInputDialog
        (
         null,
         "Digite o valor de x2: ",
         "Aula de Java",
         JOptionPane.QUESTION_MESSAGE
        );
        valorY2 = JOptionPane.showInputDialog
        (
         null,
         "Digite o valor de y2: ",
         "Aula de Java",
         JOptionPane.QUESTION_MESSAGE
        );
        x1 = Integer.valueOf(valorX1);
        y1 = Integer.valueOf(valorY1);
        x2 = Integer.valueOf(valorX2);
        y2 = Integer.valueOf(valorY2);
        distancia = Math.sqrt(Math.pow((x1-x2),2)+ Math.pow((y1-y2),2));
        JOptionPane.showMessageDialog
        (
            null,
            "O ponto de distancia entre o Ponto 1 e o Ponto 2 é de: " + distancia, 
            "Aula de Java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
