
public class Main {

	public static void main(String[] args) {
	
	Student student1 = new Student();
	student1.setId(1);
	student1.setFirstname("Ikra");
	student1.setLastname("Ozgirgin");
	student1.setEmail("ozgirginikra@gmail.com");
	student1.setNumberoflessons(5);
	
	Instructor instructor1 = new Instructor();
	instructor1.setId(1);
	instructor1.setFirstname("Engin");
	instructor1.setLastname("Demirog");
	instructor1.setEmail("engin@gmail.com");
	instructor1.setSalary(10000);
	
	//User[] users = new User[]{ student1, instructor1 };
	
	StudentManager studentManager = new StudentManager();
	studentManager.add(student1);
	studentManager.remove(student1);
	System.out.println("-----------------------------");
	
	lnstructorManager instructorManager = new lnstructorManager();
	instructorManager.add(instructor1);
	instructorManager.remove(instructor1);
	
		
	
	}
}
