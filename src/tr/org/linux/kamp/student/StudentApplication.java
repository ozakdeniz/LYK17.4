package tr.org.linux.kamp.student;

public class StudentApplication {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Arkadaş Zekai", 80);
		System.out.println(student1.getName()+ " 'nın harf notu: " 
		+ student1.getLetterGrade());
		
		
		
	}

}
