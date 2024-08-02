package wrapper;

public class MethodConverter {
    private int userNumber;

    public void setUserNumber(int dataReceived){
        this.userNumber = dataReceived;
    }

    public Integer getUserNumber(){
        Integer userNumberIntegerWrapper = this.userNumber;
        return this.userNumber;
    }
}
