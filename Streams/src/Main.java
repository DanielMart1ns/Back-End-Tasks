import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String userAswer;
    static List<Person> peopleList = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("====== Bem-vindo(a) ao cadastro ======");
        userDecisionMethod();
    }

    public static void userDecisionMethod(){
        System.out.print("\nDeseja iniciar o cadastro? [sim/nao] ");
        userAswer = scanner.next();

        while (!userAswer.equalsIgnoreCase("nao")){

            if(userAswer.equalsIgnoreCase("sim")){
                registerMethod();
            } else{
                System.out.println("Valor inválido, tente novamente...");
            }

            System.out.print("\nDeseja continuar? [sim/nao] ");
            userAswer = scanner.next();
        }

        showResults();
        System.out.println("Até logo...");
    }

    public static void registerMethod(){
        String informedName;
        String informedGender;

        System.out.print("Insira o nome a ser cadastrado: ");
        informedName = scanner.next();
        System.out.print("Informe o gênero [masc/fem]: ");
        informedGender = scanner.next();

        Person personRegistered = new Person(informedName, informedGender);
        peopleList.add(personRegistered);
    }

    public static void showResults(){
        List<Person> womensList = peopleList.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("fem"))
                .collect(Collectors.toList());

        System.out.println("\n###### Mostrando somente mulheres ######");
        womensList.forEach(women -> System.out.println("- " + women.getName()));
    }
}