public class PersonRegistration {
    private String personName;
    private String personGender;


    public PersonRegistration(String name, String gender){
        this.personName = name;
        this.personGender = gender;
    }

    @Override
    public String toString() {
        return this.personName + " " + this.personGender;
    }
}
