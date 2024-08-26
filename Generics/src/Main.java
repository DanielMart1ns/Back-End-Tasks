import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating my cars list
        List<GenericCar> carsList = new ArrayList<>();

        //Creating my attributes
        GenericCar<Long> selectedCar1 = new CustumerCar("Honda", 600, 4);
        GenericCar<Integer> selectedCar2 = new CustumerCar("Hyundai", 800, 3);
        GenericCar<String> selectedCar3 = new CustumerCar("Toyota", 1200, 2);

        //Adding my cars created to the list
        carsList.add(selectedCar1);
        carsList.add(selectedCar2);
        carsList.add(selectedCar3);

        //Showing the results
        for (GenericCar car : carsList) {
            car.showCustumerCar();
        }
    }
}