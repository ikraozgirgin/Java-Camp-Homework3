
public class lnstructorManager extends UserManager {
	
	public void add(User user) {
		System.out.println("E�itmen eklendi: " +user.getFirstname()+" "+user.getLastname());
	}
	public void remove(User user) {
		System.out.println("E�itmen silindi: " +user.getFirstname()+" "+ user.getLastname());
	}
}
