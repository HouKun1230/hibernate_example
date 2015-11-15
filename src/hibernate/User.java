package hibernate;

public class User {
	
	private int User_id;
	private String UserName;
	
	public int getId()
	{
		return User_id;
	}
	
	public void setId(int id)
	{
		this.User_id = id;
	}
	
	public String getUserName()
	{
		return UserName;
	}
	
	public void setUserName(String name)
	{
		this.UserName = name;
	}

}
