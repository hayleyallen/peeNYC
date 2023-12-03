import java.util.Scanner;

public class User {
	// data fields
	private String username;
	private String password;
	private String name;

	// constructor for username and password
	public User(String user, String pass, String name) {
		this.username = user;
		this.password = pass;
		this.name = name;
	}

	// getters and setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// print username, password, name
	public void PrintUserInfo() {
		System.out.println("Username: " + username);
		System.out.println("Name: " + name);
		System.out.println("Password: " + password);
	}
}