package gun2odev;

public class User {
	
	int id;
	String name;
	byte[] password;
	boolean teacher ;
	
	public User() {};
	public User(int id,String name,byte[] password,boolean teacher) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.teacher = teacher;
	};

}
