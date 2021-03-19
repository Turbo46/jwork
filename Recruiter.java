public class Recruiter
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    public Recruiter(int id, String name,String email, String phoneNumber,Location location)
    {
        this.id = id;
        this.name = name;
        this.phoneNumber = email;
        this.location = location;
    }

    public int getId()
    {
        return this.id;
    }
    
        public String getName()
    {
        return this.name;
    }

    public String getEmail()
    {
        return this.email;
    }
     public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public Location getLocation()
    {
        return this.location;
    }
    public void setid(int id)
    {
        this.id = id;
    }
    public void setEmail(String Email)
    {
        this.email = email;
    }
    public void setName(String Name)
    {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void setLocation(Location location)
    {
        this.location = location;
    }
    public void printData()
    {
        System.out.println(getName());
    }
}