import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        registerWithSplit();
        registerWithoutSplit();
    }

    public static void registerWithSplit(){
        System.out.println("\n**** Lista de nomes com split ****");
        System.out.println("Adicione os nomes a serem inseridos na lista separando-os por vírgula sem acrescentar espaços:");

        String nameListReceived = scanner.next();

        //Splitting our list by comma
        String[] splitList = nameListReceived.split(",");

        //Declaring our collection
        List<String> finalList = new ArrayList<String>();

        //Assigning values to the collection
        for (String nameInList : splitList){
            finalList.add(nameInList);
        }

        //Ordering the list
        Collections.sort(finalList);

        System.out.println("\nLista ordenanda:");

        for (int i = 0; i < finalList.size(); i++){
            System.out.println(finalList.get(i));
        }
    }

    public static void registerWithoutSplit(){
        System.out.println("\n**** Lista dinâmica ****");
        System.out.println("Adicione os nomes a serem inseridos:");

        List<String> nameList = new ArrayList<String>();
        String userAnswer = "sim";

        do{
            String name = scanner.next();
            nameList.add(name);
            do{
                if(!userAnswer.equalsIgnoreCase("sim") && !userAnswer.equalsIgnoreCase("nao")){
                    System.out.println("Comando não entendido, por favor, digite novamente");
                }
                System.out.println("Adicionar mais um nome? [sim]/[nao]");
                userAnswer = scanner.next();
            } while (!userAnswer.equalsIgnoreCase("sim") && !userAnswer.equalsIgnoreCase("nao"));


        }while (!userAnswer.equalsIgnoreCase("nao"));

        Collections.sort(nameList);

        System.out.println("Lista completa");
        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
    }
}