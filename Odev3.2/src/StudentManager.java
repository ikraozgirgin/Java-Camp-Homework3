
public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("Öğrenci eklendi: " + user.getFirstname()+" "+ user.getLastname());
	}
	
	public void remove(User user) {
		System.out.println("Öğrenci silindi: " + user.getFirstname()+" "+ user.getLastname());
	}
	
}
