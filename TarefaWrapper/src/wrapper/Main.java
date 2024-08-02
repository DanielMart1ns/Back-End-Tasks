package wrapper;

public class Main {
    public static void main(String[] args) {
        //Declaring my variable to be instanced
        MethodConverter method = new MethodConverter();

        //setting my userNumber
        int dataReceived = Integer.parseInt(args[0]);
        method.setUserNumber(dataReceived);

        //Printing the number inserted by user as Integer
        System.out.println("User number as Integer: " + method.getUserNumber());
    }

}