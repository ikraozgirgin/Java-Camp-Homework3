
public class UserManager  {

	public void add(User user) {
		System.out.println("Kullan�c� eklendi."+ user.getFirstname()+ user.getLastname());
	}
	
	public void remove(User user) {
		System.out.println("KUllan�c� silindi." +user.getFirstname()+ user.getLastname());
	}
}
