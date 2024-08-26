import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating my cars list
        List<GenericCar> carsList = new ArrayList<>();

        //Creating my attributes
        GenericCar<Long> selectedCar1 = new HondaCar("WR-V", 116, 2022);
        GenericCar<Integer> selectedCar2 = new MitsubishiCar("Lancer Evolution X", 280, 2007);
        GenericCar<String> selectedCar3 = new ToyotaCar("Yaris", 110, 2021);

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