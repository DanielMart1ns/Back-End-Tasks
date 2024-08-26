public class Main {
    public static void main(String[] args) {
        GenericCar<Long> selectedCar1 = new CustumerCar("Honda", 600, 4);
        GenericCar<Integer> selectedCar2 = new CustumerCar("Hyundai", 800, 3);
        GenericCar<String> selectedCar3 = new CustumerCar("Toyota", 1200, 2);

        selectedCar1.showCustumerCar();
        selectedCar2.showCustumerCar();
        selectedCar3.showCustumerCar();
    }
}