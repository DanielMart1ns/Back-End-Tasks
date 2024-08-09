import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<String> personList = new ArrayList<String>();

    public static void main(String[] args) {
        registerMethod();
    }

    public static void registerMethod(){
        String userAnswer;

        System.out.println("\n**** Bem-vindo ao registro por gênero ****");
        System.out.println("\nDeseja começar um registo? [sim]/[nao]");

        userAnswer = scanner.next();

        while (!userAnswer.equalsIgnoreCase("nao")){
            System.out.println("================================");

            if(userAnswer.equalsIgnoreCase("sim")){
                System.out.print("Insira o nome a ser cadastrado: ");
                String personName = scanner.next();
                System.out.print("Insira o gênero [masc]/[fem]: ");
                String personGender = scanner.next();

                PersonRegistration person = new PersonRegistration(personName, personGender);

                personList.add(String.valueOf(person));

            } else {
                System.out.println("Comando não identificado, por favor, tente novamete.");
            }

            System.out.println("*Deseja continuar com o registro? [sim]/[nao]");

            userAnswer = scanner.next();
        }

        if(!personList.isEmpty()){
            showResults();
        }
    }

    public static void showResults(){
        int cont = 0;
        System.out.println("**** Registro ****");
        System.out.println("Gênero masculino");

        for(int i = 0; i < personList.size(); i++){
            if(personList.get(i).contains("masc")){
                String[] malePerson = personList.get(i).split("\\s");
                cont++;
                System.out.print(cont + "- ");
                System.out.println(malePerson[0]);
            }
        }

        System.out.println("\nGênenro feminino:");
        cont = 0;
        for(int i = 0; i < personList.size(); i++){
            if(personList.get(i).contains("fem")){
                String[] femalePerson = personList.get(i).split("\\s");
                cont++;
                System.out.print(cont + "- ");
                System.out.println(femalePerson[0]);
            }
        }
    }
}