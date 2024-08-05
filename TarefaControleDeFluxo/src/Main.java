import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grades calc = new Grades();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n#### Bem-vindo ao cálculo de médias ####");
        System.out.println("\nIniciar cálculo? [sim]/[nao] ");

        String userAnswer = scanner.next();

        do{
            if (userAnswer.equalsIgnoreCase("sim")) {
                calc.setGrades();
                System.out.println("Iniciar novo cálculo? [sim]/[nao]");
            }
            else if (!userAnswer.equalsIgnoreCase("nao") && !userAnswer.equalsIgnoreCase("sim")) {
                System.out.println("Comando não identificado, por favor, tente novamente.");
                System.out.println("Tentar novamente? [sim]/[nao]");
            }
            userAnswer = scanner.next();
        } while (!userAnswer.equalsIgnoreCase("nao"));
    }
}