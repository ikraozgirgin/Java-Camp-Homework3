
public class lnstructorManager extends UserManager {
	
	public void add(User user) {
		System.out.println("Eðitmen eklendi: " +user.getFirstname()+" "+user.getLastname());
	}
	public void remove(User user) {
		System.out.println("Eðitmen silindi: " +user.getFirstname()+" "+ user.getLastname());
	}
}
