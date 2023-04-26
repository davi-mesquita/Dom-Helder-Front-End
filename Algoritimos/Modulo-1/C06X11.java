import javax.swing.JOptionPane;
public class C06X11 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String equipe1,equipe2,p1,p2;
        int point1,point2;
        equipe1 = JOptionPane.showInputDialog
        (
                null,
                "Digite o nome da equipe1: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        equipe2 = JOptionPane.showInputDialog
        (
                null,
                "Digite o nome da equipe2: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        p1 = JOptionPane.showInputDialog
        (
                null,
                "Digite os sets da 1° equipe: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        p2 = JOptionPane.showInputDialog
        (
                null,
                "Digite os sets da 2° equipe: ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );

        point1 = Integer.parseInt(p1.substring(0,1));
        point2 = Integer.parseInt(p2.substring(0,1));
        if( point1 == 3 && point2 <= 1 ){
            JOptionPane.showMessageDialog
            (
                    null,
                    "A equipe " + equipe1 + " ficou com a pontuação de 3 pontos \n" +
                    "e a equipe " + equipe2 + " ficou com a pontuação de 0",
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }else if( point2 == 3 && point1 <= 1 ){
            JOptionPane.showMessageDialog
            (
                    null,
                    "A equipe " + equipe2 + " ficou com a pontuação de 3 pontos \n" +
                    "e a equipe " + equipe1 + " ficou com a pontuação de 0",
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }else if(point1 == 3 && point2 == 2){
            JOptionPane.showMessageDialog
            (
                    null,
                    "A equipe " + equipe1 + " ficou com a pontuação de 2 pontos \n" +
                    "e a equipe " + equipe2 + " ficou com a pontuação de 1",
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else if(point2 == 3 && point1 == 2){
            JOptionPane.showMessageDialog
            (
                    null,
                    "A equipe " + equipe2 + " ficou com a pontuação de 2 pontos \n" +
                    "e a equipe " + equipe1 + " ficou com a pontuação de 1",
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog
            (
                    null,
                    "A pontuação não foi computada",
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
                
    }
}
