package Calculator;

public class VoteCalculator {

    final static Double totalVotes = 1000.00D;    //Total de votos
    final static Double valid = 800.00D;          //Votos válidos
    final static Double blank = 150.00D;         //Votos em branco
    final static Double invalid = 50.00D;       //Votos nulos

    /*
        Calcula o percentual de votos válidos.
     */
    public double calculateValidVotes() {
        double percentage;
        percentage = (valid * 100 / totalVotes);
        System.out.println("A percentagem de votos válidos é de = " + percentage + "%");
        return percentage;
    }

    /*
        Calcula o percentual de votos em branco.
     */
    public double calculateBlankVotes() {
        double percentage;
        percentage = (blank * 100 / totalVotes);
        System.out.println("A percentagem de votos em branco é de = " + percentage + "%");
        return percentage;
    }

    /*
            Calcula o percentual de votos nulos.
     */
    public double calculateInvalidVotes() {
        double percentage;
        percentage = (invalid * 100 / totalVotes);
        System.out.println("A percentagem do votos nulos é de = " + percentage + "%");
        return percentage;
    }

}