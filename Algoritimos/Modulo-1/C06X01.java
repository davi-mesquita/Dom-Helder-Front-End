import javax.swing.JOptionPane;
public class C06X01 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String entrada;
        double x,f;
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite o valor de x: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        x = Integer.parseInt(entrada);
        if(x < 4){
            f = (5*x+3)/(Math.sqrt(16 - Math.pow(x,2)));
        } else if(x == 4){
            f = 0;
        }else{
            f = (5*x+3)/(Math.sqrt(Math.pow(x,2) - 16));
        }
        JOptionPane.showMessageDialog
        (
            null,
            "O valor de f(x) é: " + f,
            "Aula de Java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
