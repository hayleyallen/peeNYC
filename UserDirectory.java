import java.util.Scanner;
import java.util.ArrayList;

public class UserDirectory {
	private ArrayList<User> userList = new ArrayList<User>();

	// add entry
	public void addEntry(User entry) {
		userList.add(entry);
	}

	//check if user successfully logged in
	public int accountCheck(String usernameAttempt, String passwordAttempt) {
		for (int i = 0; i < size; i++) {
			if(userlist.get(i).getUsername() == usernameAttempt) {
				if (userList.get(i).getPassword() == passwordAttempt)
					return i;
			}
		}
		return -2;
	}
}