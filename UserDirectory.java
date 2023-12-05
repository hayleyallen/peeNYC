import java.util.Scanner;
import java.util.ArrayList;

public class UserDirectory {

	private ArrayList<User> userList = new ArrayList<User>();

	int size = 0;

	// add entry
	public void addEntry(User entry) {
		userList.add(entry);
		size++;
	}

	public int getSize() {
		return size;
	}

	public User getEntry(int index) {
		return userList.get(index);
	}

	// check if user successfully logged in
	public int accountCheck(String usernameAttempt, String passwordAttempt) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getUsername().equals(usernameAttempt)) {
				if (userList.get(i).getPassword().equals(passwordAttempt)) {
					return i;
				}
			}
		}
		return -2;
	}

	// get user's name
	public String findName(int i) {
		return userList.get(i).getName();
	}
}