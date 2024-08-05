import java.util.Scanner;

public class Grades {
    private Double firstGrade;
    private Double secondGrade;
    private Double thirdGrade;
    private Double fourthGrade;

    //Assigning grades
    private void setFirstGrade(Double informedGrade) {
        this.firstGrade = informedGrade;
    }

    private void setSecondGrade(Double informedGrade) {
        this.secondGrade = informedGrade;
    }

    private void setThirdGrade(Double informedGrade) {
        this.thirdGrade = informedGrade;
    }

    private void setFourthGrade(Double informedGrade){
        this.fourthGrade = informedGrade;
    }

    //Getting student grades
    public void setGrades (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.print("Insira a primeira nota: ");
        setFirstGrade(scanner.nextDouble());

        System.out.print("Insira a segunda nota: ");
        setSecondGrade(scanner.nextDouble());

        System.out.print("Insira a terceira nota: ");
        setThirdGrade(scanner.nextDouble());

        System.out.print("Insira a quarta nota: ");
        setFourthGrade(scanner.nextDouble());

        getFinalMedia();
    }

    public void getFinalMedia(){
        double sum = this.firstGrade + this.secondGrade + this.thirdGrade + this.fourthGrade;
        Double media = sum / 4;
        String studentStatus = setStudentStatus(media);

        System.out.println("-----------------------");
        System.out.println("Média final: " + media);
        System.out.println(studentStatus);
        System.out.println("=========================");
    }

    public String setStudentStatus(Double media){
        if(media >= 7){
            return "Aprovado";
        } else if(media >= 5){
            return "Recuperação";
        } else{
            return "Reprovado";
        }
    }
}
