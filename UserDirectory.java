import java.util.Scanner;
import java.util.ArrayList;

public class UserDirectory {
	private ArrayList<User> userList = new ArrayList<User>();

	// add entry
	public void addEntry(User entry) {
		userList.add(entry);
	}
}