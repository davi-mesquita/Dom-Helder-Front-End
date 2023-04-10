import javax.swing.JOptionPane;
public class C05X10 {
    //Autor: Davi Mesquita da Fonseca
    public static void main(String[] args) {
        double fahrenheit, celsius, kelvin;
        String entrada;
        entrada = JOptionPane.showInputDialog
        (
            null,
            "Digite a temperatura em Celsius: ",
            "Aula de java",
            JOptionPane.QUESTION_MESSAGE
        );
        celsius = Double.parseDouble(entrada);
        fahrenheit = (celsius * 1.8) + 32;
        kelvin = celsius + 273.15;
        JOptionPane.showMessageDialog
        (
            null,
            "A temperatura em Fahrenheit é: " + fahrenheit + "°F" +
            "\nA temperatura em Kelvin é: " + kelvin + "K",
            "Aula de java",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
