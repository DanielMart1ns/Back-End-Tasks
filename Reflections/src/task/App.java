package task;

public class App {

	public static void main(String[] args) {
		//Selecting the class to have annotation extracted
		Class selectedClass = DataTable.class;
		
		//Extracting the annotation
		AnnotationTable tableName = (AnnotationTable) selectedClass.getAnnotation(AnnotationTable.class);
		
		//Printing to the console the annotation value
		System.out.println("Nome da tabela: " + "\"" + tableName.value() + "\""); // Result = Nome da tabela: "userNames"
	}

}
