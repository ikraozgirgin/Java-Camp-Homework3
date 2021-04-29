
public class UserManager  {

	public void add(User user) {
		System.out.println("Kullanýcý eklendi."+ user.getFirstname()+ user.getLastname());
	}
	
	public void remove(User user) {
		System.out.println("KUllanýcý silindi." +user.getFirstname()+ user.getLastname());
	}
}
