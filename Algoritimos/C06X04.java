import javax.swing.JOptionPane;
public class C06X04 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        String nome, valorAltura,valorPeso;
        double altura, imc, peso;
        nome = JOptionPane.showInputDialog
        (
            null,
            "Digite seu nome: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        valorAltura = JOptionPane.showInputDialog
        (
            null,
            "Digite sua altura: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        valorPeso = JOptionPane.showInputDialog
        (
            null,
            "Digite seu peso: ",
            "Aula de Java",
            JOptionPane.QUESTION_MESSAGE
        );
        altura = Double.parseDouble(valorAltura);
        peso = Double.parseDouble(valorPeso);
        imc = peso / Math.pow(altura, 2);
        if(imc < 18){
            JOptionPane.showMessageDialog
            (
                null,
                "Seu IMC é: " + imc + "\n Você está desnutrida.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else if(imc >= 18 & imc < 20){
            JOptionPane.showMessageDialog
            (
                null,
                "Seu IMC é: " + imc + "\n Você está abaixo do peso.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else if(imc >= 20 & imc <= 25){
            JOptionPane.showMessageDialog
            (
                null,
                "Seu IMC é: " + imc + "\n Você está no peso ideal.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else if(imc > 25 & imc <= 27){
            JOptionPane.showMessageDialog
            (
                null,
                "Seu IMC é: " + imc + "\n Você está acima do peso.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog
            (
                null,
                "Seu IMC é: " + imc + "\n Você está obesa.",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
