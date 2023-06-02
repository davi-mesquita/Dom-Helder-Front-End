import javax.swing.JOptionPane;

public class C08EX11{
    public static void main(String[] args) {
        double maior = 0, maiorSm = 0, menorSm=0;
        int loirarara = 0;
        String nomeMaior = "";

        for (int aux = 0 ; aux < 2; aux++) {
            String[] botoes = {"M", "F",};
            String[] botoes1 = {"S", "C", "O",};
            String[] botoes2 = {"A", "C", "P", "Outro",};
            String[] botoes3 = {"C", "L", "P", "R",};
            String[] botoes4 = {"1", "2", "3", "4",};

            String nome = JOptionPane.showInputDialog(null,
                    "Digite seu nome",
                    "Nome",
                    JOptionPane.INFORMATION_MESSAGE);

            String idade = JOptionPane.showInputDialog(null,
                    "Digite sua idade",
                    "Idade",
                    JOptionPane.INFORMATION_MESSAGE);


            int sexo = JOptionPane.showOptionDialog(null,
                    "Selecione seu sexo (“M” para masculino ou “F” para feminino)",
                    "SEXO",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes,
                    "M");

            int estadoCivil = JOptionPane.showOptionDialog(null,
                    "Selecione seu Estado Civil (“C” para casado, “S” para solteiro ou “O” para outros)",
                    "Estado Civil",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes1,
                    "Solteiro");

            int corOlhos = JOptionPane.showOptionDialog(null,
                    "Selecione a cor dos seus olhos (“A” para azul, “C” para castanhos, “P” para preto ou “O” para outros)",
                    "Cor dos Olhos",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes2,
                    "A");

            int corCabelo = JOptionPane.showOptionDialog(null,
                    "Selecione a cor dos seu cabelo (“L” para loiro, “P” para preto, “C” para castanhos ou “R” para ruivos)",
                    "Cor do Caelo",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes3,
                    "C");

            String salario = JOptionPane.showInputDialog(null,
                    "Digite seu salario",
                    "Idade",
                    JOptionPane.INFORMATION_MESSAGE);



            int escolaridade = JOptionPane.showOptionDialog(null,
                    "Selecione sua escolaridade (1 para analfabeto, 2 para ensino fundamental, 3 para ensino médio ou 4 para superior)",
                    "Escolaridade",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoes4,
                    "1");


            int idadeInt = Integer.valueOf(idade);
            double salarioStr = Double.valueOf(salario);



            if ( sexo == 1  && corCabelo == 1 && estadoCivil == 0 &&  corOlhos == 0 && escolaridade == 3 && 18 < idadeInt && idadeInt < 25 && salarioStr > 10000 ){
                loirarara++;
            }

            if (aux == 0 || salarioStr> maior){
                maior = salarioStr;
                nomeMaior = nome;
            }

            if (sexo == 0) {
                if (aux == 0 || salarioStr > maiorSm) {
                    maiorSm = salarioStr;
                }

                if ( aux == 0 || salarioStr < menorSm) {
                    menorSm = salarioStr;
                    System.out.println(menorSm);

                }
            }
        }


        double diferencaSm = maiorSm - menorSm;

        JOptionPane.showMessageDialog(null,
                "Quantidade de Mulher com a Caracteristica determinada: "+loirarara+ "\n Nome de quem tem o maior salário:" +nomeMaior + "\nDiferença de Salário Masculino: " +diferencaSm  );

        JOptionPane.showMessageDialog(null,
                +maiorSm+ "\n" +menorSm);
    }
}