public class User 
{
    private String username;
    private String emali;
    private String fullname;
    private String[] users;

    public User(String username,String emali,String fullname,String[] user)
    {
        this.username=username;
        this.emali=emali;
        this.fullname=fullname;
        this.users=users;
    }
    public String getUsername()
    {
        return username;
    }
    public String getEmail()
    {
        return emali;
    }
    public String getFullName()
    {
        return fullname;
    }
     public String getUsers()
    {
        String Guser=" ";
        for (int i =0 ;i<users.length;i++)
        {
            Guser=Guser+users[i];
        }
        return Guser;
    } 
    public String toString()
    {
        return ("User Name: "+getUsername()+"\n"+"Full name:"+getFullName()+ "\n"+"E-mail:"+getEmail());
    }

}