
public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("��renci eklendi: " + user.getFirstname()+" "+ user.getLastname());
	}
	
	public void remove(User user) {
		System.out.println("��renci silindi: " + user.getFirstname()+" "+ user.getLastname());
	}
	
}
